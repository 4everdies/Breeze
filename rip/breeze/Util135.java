package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.annotations.JSGetter;

public abstract class Util135 implements Scriptable {
   private Scriptable scriptable_a;
   private Scriptable scriptable_b;
   private final Map<String, Object> map_c = new LinkedHashMap<>();
   private static final ConcurrentHashMap<Class<?>, Scriptable> CONST_D;
   private static final Map<Scriptable, Map<Class<?>, Scriptable>> CONST_E;
   private static final Map<Class<?>, ScriptObject> CONST_F;
   private static final ClassValue<Util33> CONST_G;
   private static final Object CONST_H;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);

   @Override
   public Scriptable getPrototype() {
      return this.scriptable_a;
   }

   @Override
   public void setPrototype(Scriptable var1) {
      this.scriptable_a = var1;
   }

   @Override
   public Scriptable getParentScope() {
      return this.scriptable_b;
   }

   @Override
   public void setParentScope(Scriptable var1) {
      this.scriptable_b = var1;
   }

   private void processAll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/Util135.scriptable_b Lorg/mozilla/javascript/Scriptable;
      // 04: ifnull 1a
      // 07: aload 0
      // 08: getfield rip/breeze/Util135.scriptable_a Lorg/mozilla/javascript/Scriptable;
      // 0b: ifnull 1a
      // 0e: goto 15
      // 11: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: return
      // 16: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: invokestatic org/mozilla/javascript/Context.getCurrentContext ()Lorg/mozilla/javascript/Context;
      // 1d: astore 1
      // 1e: aload 1
      // 1f: ifnonnull 27
      // 22: return
      // 23: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 1
      // 28: invokestatic rip/breeze/Util135.getScriptable_2 (Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Scriptable;
      // 2b: astore 2
      // 2c: aload 2
      // 2d: ifnonnull 35
      // 30: return
      // 31: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 2
      // 36: aload 0
      // 37: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3a: invokestatic rip/breeze/Util135.getScriptable (Lorg/mozilla/javascript/Scriptable;Ljava/lang/Class;)Lorg/mozilla/javascript/Scriptable;
      // 3d: astore 3
      // 3e: aload 0
      // 3f: aload 2
      // 40: putfield rip/breeze/Util135.scriptable_b Lorg/mozilla/javascript/Scriptable;
      // 43: aload 0
      // 44: aload 3
      // 45: putfield rip/breeze/Util135.scriptable_a Lorg/mozilla/javascript/Scriptable;
      // 48: return
      // try (0 -> 6): 7 java/lang/RuntimeException
      // try (3 -> 10): 10 java/lang/RuntimeException
      // try (14 -> 17): 17 java/lang/RuntimeException
      // try (22 -> 25): 25 java/lang/RuntimeException
   }

   @Override
   public Object get(String var1, Scriptable var2) {
      this.processAll();
      Object var3 = this.map_c.get(var1);

      try {
         if (var3 != null) {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw getThrowable(var4);
      }

      return Scriptable.NOT_FOUND;
   }

   @Override
   public Object get(int var1, Scriptable var2) {
      this.processAll();
      return Scriptable.NOT_FOUND;
   }

   @Override
   public boolean has(String var1, Scriptable var2) {
      this.processAll();
      return this.map_c.containsKey(var1);
   }

   @Override
   public boolean has(int var1, Scriptable var2) {
      this.processAll();
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
      // 00: aload 0
      // 01: invokespecial rip/breeze/Util135.processAll ()V
      // 04: aload 2
      // 05: aload 0
      // 06: if_acmpeq 2b
      // 09: aload 2
      // 0a: instanceof rip/breeze/Util135
      // 0d: ifeq 2b
      // 10: goto 17
      // 13: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 2
      // 18: checkcast rip/breeze/Util135
      // 1b: getfield rip/breeze/Util135.map_c Ljava/util/Map;
      // 1e: aload 1
      // 1f: aload 3
      // 20: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 25: pop
      // 26: return
      // 27: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield rip/breeze/Util135.map_c Ljava/util/Map;
      // 2f: aload 1
      // 30: aload 3
      // 31: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 36: pop
      // 37: return
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (5 -> 19): 19 java/lang/RuntimeException
   }

   @Override
   public void put(int var1, Scriptable var2, Object var3) {
      this.processAll();
   }

   @Override
   public void delete(String var1) {
      this.processAll();
      this.map_c.remove(var1);
   }

   @Override
   public void delete(int var1) {
      this.processAll();
   }

   @Override
   public Object[] getIds() {
      this.processAll();
      return this.map_c.keySet().toArray();
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
      // 00: aload 0
      // 01: invokespecial rip/breeze/Util135.processAll ()V
      // 04: aload 1
      // 05: ifnull 15
      // 08: aload 1
      // 09: ldc java/lang/String
      // 0b: if_acmpne 47
      // 0e: goto 15
      // 11: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/StringBuilder
      // 18: dup
      // 19: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c: ldc "["
      // 1e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21: aload 0
      // 22: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 25: invokestatic rip/breeze/Util135.buildString (Ljava/lang/Class;)Ljava/lang/String;
      // 28: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b: ldc "@"
      // 2d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30: aload 0
      // 31: invokevirtual java/lang/Object.hashCode ()I
      // 34: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: ldc "]"
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 42: areturn
      // 43: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 0
      // 48: areturn
      // try (0 -> 7): 8 java/lang/RuntimeException
      // try (4 -> 29): 29 java/lang/RuntimeException
   }

   @Override
   public String getClassName() {
      return buildString(this.getClass());
   }

   @Override
   public boolean hasInstance(Scriptable param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial rip/breeze/Util135.processAll ()V
      // 04: aload 1
      // 05: invokeinterface org/mozilla/javascript/Scriptable.getPrototype ()Lorg/mozilla/javascript/Scriptable; 1
      // 0a: astore 2
      // 0b: aload 2
      // 0c: ifnull 2e
      // 0f: aload 2
      // 10: aload 0
      // 11: getfield rip/breeze/Util135.scriptable_a Lorg/mozilla/javascript/Scriptable;
      // 14: if_acmpne 24
      // 17: goto 1e
      // 1a: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: ireturn
      // 20: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 2
      // 25: invokeinterface org/mozilla/javascript/Scriptable.getPrototype ()Lorg/mozilla/javascript/Scriptable; 1
      // 2a: astore 2
      // 2b: goto 0b
      // 2e: bipush 0
      // 2f: ireturn
      // try (5 -> 11): 12 java/lang/RuntimeException
      // try (7 -> 16): 16 java/lang/RuntimeException
   }

   @Override
   public String toString() {
      return this.getClassName() + "@" + Integer.toHexString(this.hashCode());
   }

   public static <T extends Util135> void processAll_2(Context param0, Scriptable param1, Class<T> param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/Util135.101690052097789L J
      // 003: ldc2_w 92407804470510
      // 006: lxor
      // 007: lstore 3
      // 008: getstatic rip/breeze/Util135.CONST_G Ljava/lang/ClassValue;
      // 00b: aload 2
      // 00c: invokevirtual java/lang/ClassValue.get (Ljava/lang/Class;)Ljava/lang/Object;
      // 00f: checkcast rip/breeze/Util33
      // 012: astore 5
      // 014: aload 5
      // 016: getfield rip/breeze/Util33.string_a Ljava/lang/String;
      // 019: astore 6
      // 01b: aload 1
      // 01c: invokestatic org/mozilla/javascript/ScriptableObject.getTopLevelScope (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 01f: astore 7
      // 021: aload 7
      // 023: invokestatic org/mozilla/javascript/ScriptableObject.getObjectPrototype (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 026: astore 8
      // 028: aload 7
      // 02a: invokestatic org/mozilla/javascript/ScriptableObject.getFunctionPrototype (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 02d: astore 9
      // 02f: aload 0
      // 030: aload 7
      // 032: invokevirtual org/mozilla/javascript/Context.newObject (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 035: astore 10
      // 037: aload 10
      // 039: checkcast org/mozilla/javascript/ScriptableObject
      // 03c: aload 8
      // 03e: invokevirtual org/mozilla/javascript/ScriptableObject.setPrototype (Lorg/mozilla/javascript/Scriptable;)V
      // 041: aload 10
      // 043: checkcast org/mozilla/javascript/ScriptableObject
      // 046: aload 7
      // 048: invokevirtual org/mozilla/javascript/ScriptableObject.setParentScope (Lorg/mozilla/javascript/Scriptable;)V
      // 04b: aload 0
      // 04c: aload 7
      // 04e: aload 10
      // 050: aload 2
      // 051: invokestatic rip/breeze/Util135.processNullable (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Class;)V
      // 054: aload 7
      // 056: aload 9
      // 058: aload 10
      // 05a: aload 2
      // 05b: aload 5
      // 05d: invokestatic rip/breeze/Util135.processAll_3 (Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Class;Lrip/breeze/Util33;)V
      // 060: new rip/breeze/Util138
      // 063: dup
      // 064: aload 7
      // 066: aload 9
      // 068: aload 6
      // 06a: aload 2
      // 06b: aload 5
      // 06d: aload 10
      // 06f: invokespecial rip/breeze/Util138.<init> (Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Class;Lrip/breeze/Util33;Lorg/mozilla/javascript/Scriptable;)V
      // 072: astore 11
      // 074: aload 11
      // 076: sipush 27722
      // 079: ldc2_w 5724690520599443432
      // 07c: lload 3
      // 07d: lxor
      // 07e: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 6
      // 085: invokestatic org/mozilla/javascript/ScriptableObject.putProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;)V
      // 088: getstatic rip/breeze/Util135.CONST_F Ljava/util/Map;
      // 08b: aload 2
      // 08c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 091: checkcast rip/breeze/ScriptObject
      // 094: astore 12
      // 096: aload 12
      // 098: ifnull 0cc
      // 09b: aload 12
      // 09d: invokeinterface rip/breeze/ScriptObject.description ()Ljava/lang/String; 1
      // 0a2: ifnull 0cc
      // 0a5: goto 0ac
      // 0a8: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 11
      // 0ae: sipush 19185
      // 0b1: ldc2_w 836415980872700237
      // 0b4: lload 3
      // 0b5: lxor
      // 0b6: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: aload 12
      // 0bd: invokeinterface rip/breeze/ScriptObject.description ()Ljava/lang/String; 1
      // 0c2: invokestatic org/mozilla/javascript/ScriptableObject.putProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;)V
      // 0c5: goto 0cc
      // 0c8: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: aload 11
      // 0ce: sipush 3767
      // 0d1: ldc2_w 4716230547779441927
      // 0d4: lload 3
      // 0d5: lxor
      // 0d6: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 10
      // 0dd: invokestatic org/mozilla/javascript/ScriptableObject.putProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;)V
      // 0e0: aload 10
      // 0e2: sipush 4636
      // 0e5: ldc2_w 4992545882117786036
      // 0e8: lload 3
      // 0e9: lxor
      // 0ea: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: aload 11
      // 0f1: invokestatic org/mozilla/javascript/ScriptableObject.putProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;)V
      // 0f4: aload 1
      // 0f5: aload 6
      // 0f7: aload 11
      // 0f9: invokestatic org/mozilla/javascript/ScriptableObject.putProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;)V
      // 0fc: getstatic rip/breeze/Util135.CONST_D Ljava/util/concurrent/ConcurrentHashMap;
      // 0ff: aload 2
      // 100: aload 10
      // 102: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 105: pop
      // 106: return
      // try (67 -> 72): 73 java/lang/RuntimeException
      // try (69 -> 84): 85 java/lang/RuntimeException
   }

   private static Scriptable getScriptable(Scriptable var0, Class<?> var1) {
      Map var2 = CONST_E.computeIfAbsent(var0, Util135::lambda$getOrBuildPrototype_Inner0);
      Scriptable var3 = (Scriptable)var2.get(var1);

      try {
         if (var3 != null) {
            return var3;
         }
      } catch (RuntimeException var8) {
         throw getThrowable(var8);
      }

      Util33 var4 = CONST_G.get(var1);
      Scriptable var5 = ScriptableObject.getObjectPrototype(var0);
      Scriptable var6 = ScriptableObject.getFunctionPrototype(var0);
      Scriptable var7 = Context.getCurrentContext().newObject(var0);
      ((ScriptableObject)var7).setPrototype(var5);
      ((ScriptableObject)var7).setParentScope(var0);
      processNullable(Context.getCurrentContext(), var0, var7, var1);
      processAll_3(var0, var6, var7, var1, var4);
      var2.put(var1, var7);
      return var7;
   }

   private static void processNullable(Context var0, Scriptable var1, Scriptable var2, Class<?> var3) {
      Class var4 = var3.getSuperclass();

      try {
         if (var4 == null) {
            return;
         }
      } catch (RuntimeException var9) {
         throw getThrowable(var9);
      }

      try {
         if (!Util135.class.isAssignableFrom(var4)) {
            return;
         }
      } catch (RuntimeException var7) {
         throw getThrowable(var7);
      }

      try {
         if (var4.getAnnotation(ScriptObject.class) == null) {
            return;
         }
      } catch (RuntimeException var8) {
         throw getThrowable(var8);
      }

      Class var5 = var4;
      Scriptable var6 = CONST_D.get(var5);
      if (var6 == null) {
         var6 = getScriptable(var1, var5);
      }

      ((ScriptableObject)var2).setPrototype(var6);
   }

   private static void processAll_3(Scriptable var0, Scriptable var1, Scriptable var2, Class<?> var3, Util33 var4) {
      long var5 = 132791384194252L;
      LinkedHashMap var7 = new LinkedHashMap();

      for (Util32 var9 : var4.list_b) {
         List var10 = (List)var7.get(var9.string_a);
         if (var10 == null) {
            var10 = new ArrayList();
            var7.put(var9.string_a, var10);
         }

         var10.add(var9);
      }

      for (Entry var19 : var7.entrySet()) {
         List var21 = (List)var19.getValue();
         BaseFunction var12;
         if (var21.size() == 1) {
            Util32 var23 = (Util32)var21.get(0);
            var12 = new Util139(var0, var1, var3, var23.string_a, var23.methodHandle_d, var23.arr_c, null, var23.fieldInt_b, EnumType17.CONST_FN);
         } else {
            ArrayList var11 = new ArrayList(var21.size());

            for (Util32 var14 : var21) {
               var11.add(new Util139(var0, var1, var3, var14.string_a, var14.methodHandle_d, var14.arr_c, null, var14.fieldInt_b, EnumType17.CONST_FN));
            }

            var12 = new ScriptUtil((String)var19.getKey(), var11);
         }

         ScriptableObject.putProperty(var12, "length", var12.getLength());
         ScriptableObject.defineProperty(var2, (String)var19.getKey(), var12, 2);
      }

      for (Entry var20 : var4.map_c.entrySet()) {
         String var22 = (String)var20.getKey();
         Util30 var25 = (Util30)var20.getValue();
         Util139 var24 = null;
         Util139 var26 = null;
         if (var25.methodHandle_a != null) {
            var24 = new Util139(
               var0, var1, var3, "get " + var22, var25.methodHandle_a, null, null, 0, EnumType17.GET
            );
         }

         if (var25.methodHandle_b != null) {
            var26 = new Util139(
               var0, var1, var3, "set " + var22, var25.methodHandle_b, null, var25.enum8Val_c, 1, EnumType17.SET
            );
         }

         NativeObject var27 = new NativeObject();

         NativeObject var10000;
         String var10001;
         Object var10002;
         label56: {
            try {
               ScriptableObject.putProperty(var27, "enumerable", Boolean.TRUE);
               ScriptableObject.putProperty(var27, "configurable", Boolean.TRUE);
               var10000 = var27;
               var10001 = "get";
               if (var24 != null) {
                  var10002 = var24;
                  break label56;
               }
            } catch (RuntimeException var16) {
               throw getThrowable(var16);
            }

            var10002 = Undefined.instance;
         }

         label49: {
            try {
               ScriptableObject.putProperty(var10000, var10001, var10002);
               var10000 = var27;
               var10001 = "set";
               if (var26 != null) {
                  var10002 = var26;
                  break label49;
               }
            } catch (RuntimeException var15) {
               throw getThrowable(var15);
            }

            var10002 = Undefined.instance;
         }

         ScriptableObject.putProperty(var10000, var10001, var10002);
         ((ScriptableObject)var2).defineOwnProperty(Context.getCurrentContext(), var22, var27);
      }
   }

   private static Scriptable getScriptable_2(Context var0) {
      long var1 = 104629397638132L;

      try {
         return ScriptRuntime.getTopCallScope(var0);
      } catch (Throwable var8) {
         try {
            Method var4 = ScriptRuntime.class.getDeclaredMethod("getTopCallScope", Context.class);
            var4.setAccessible(true);
            Object var5 = var4.invoke(null, var0);

            try {
               if (var5 instanceof Scriptable) {
                  return (Scriptable)var5;
               }
            } catch (Throwable var6) {
               throw getThrowable(var6);
            }

            return null;
         } catch (Throwable var7) {
            return null;
         }
      }
   }

   private static ScriptObject getScriptObject(Class<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/Util135.101690052097789L J
      // 03: ldc2_w 138299916155803
      // 06: lxor
      // 07: lstore 1
      // 08: getstatic rip/breeze/Util135.CONST_F Ljava/util/Map;
      // 0b: aload 0
      // 0c: new rip/breeze/FuncUtil4
      // 0f: dup
      // 10: invokespecial rip/breeze/FuncUtil4.<init> ()V
      // 13: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 18: checkcast rip/breeze/ScriptObject
      // 1b: astore 3
      // 1c: aload 3
      // 1d: ifnonnull 59
      // 20: new java/lang/StringBuilder
      // 23: dup
      // 24: invokespecial java/lang/StringBuilder.<init> ()V
      // 27: sipush 20957
      // 2a: ldc2_w 2802754790620157196
      // 2d: lload 1
      // 2e: lxor
      // 2f: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: aload 0
      // 38: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: sipush 21428
      // 41: ldc2_w 1070470169625646963
      // 44: lload 1
      // 45: lxor
      // 46: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 54: athrow
      // 55: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 3
      // 5a: invokeinterface rip/breeze/ScriptObject.name ()Ljava/lang/String; 1
      // 5f: ifnull 78
      // 62: aload 3
      // 63: invokeinterface rip/breeze/ScriptObject.name ()Ljava/lang/String; 1
      // 68: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 6b: invokevirtual java/lang/String.isEmpty ()Z
      // 6e: ifeq be
      // 71: goto 78
      // 74: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: new java/lang/StringBuilder
      // 7b: dup
      // 7c: invokespecial java/lang/StringBuilder.<init> ()V
      // 7f: ldc "@"
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: ldc rip/breeze/ScriptObject
      // 86: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: sipush 6938
      // 8f: ldc2_w 1255728411752210368
      // 92: lload 1
      // 93: lxor
      // 94: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9c: aload 0
      // 9d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: sipush 2045
      // a6: ldc2_w 7639674708431962918
      // a9: lload 1
      // aa: lxor
      // ab: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b6: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // b9: athrow
      // ba: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: aload 3
      // bf: areturn
      // try (12 -> 35): 35 java/lang/RuntimeException
      // try (37 -> 45): 46 java/lang/RuntimeException
      // try (40 -> 74): 74 java/lang/RuntimeException
   }

   private static String buildString(Class<?> var0) {
      return getScriptObject(var0).name().trim();
   }

   private static EnumType8 getEnum8Val(Class<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 04: if_acmpeq 15
      // 07: aload 0
      // 08: ldc_w java/lang/Double
      // 0b: if_acmpne 1d
      // 0e: goto 15
      // 11: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic rip/breeze/EnumType8.CONST_D Lrip/breeze/EnumType8;
      // 18: areturn
      // 19: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 21: if_acmpeq 32
      // 24: aload 0
      // 25: ldc_w java/lang/Float
      // 28: if_acmpne 3a
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: getstatic rip/breeze/EnumType8.CONST_F Lrip/breeze/EnumType8;
      // 35: areturn
      // 36: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 3e: if_acmpeq 86
      // 41: aload 0
      // 42: ldc java/lang/Integer
      // 44: if_acmpeq 86
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 52: if_acmpeq 86
      // 55: goto 5c
      // 58: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 0
      // 5d: ldc_w java/lang/Short
      // 60: if_acmpeq 86
      // 63: goto 6a
      // 66: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 6e: if_acmpeq 86
      // 71: goto 78
      // 74: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aload 0
      // 79: ldc_w java/lang/Byte
      // 7c: if_acmpne 8e
      // 7f: goto 86
      // 82: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: getstatic rip/breeze/EnumType8.CONST_I Lrip/breeze/EnumType8;
      // 89: areturn
      // 8a: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 92: if_acmpeq a3
      // 95: aload 0
      // 96: ldc_w java/lang/Long
      // 99: if_acmpne ab
      // 9c: goto a3
      // 9f: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2: athrow
      // a3: getstatic rip/breeze/EnumType8.CONST_J Lrip/breeze/EnumType8;
      // a6: areturn
      // a7: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: aload 0
      // ac: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // af: if_acmpeq c0
      // b2: aload 0
      // b3: ldc_w java/lang/Boolean
      // b6: if_acmpne c8
      // b9: goto c0
      // bc: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bf: athrow
      // c0: getstatic rip/breeze/EnumType8.CONST_Z Lrip/breeze/EnumType8;
      // c3: areturn
      // c4: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7: athrow
      // c8: aload 0
      // c9: ldc java/lang/String
      // cb: if_acmpeq df
      // ce: ldc_w java/lang/CharSequence
      // d1: aload 0
      // d2: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // d5: ifeq e7
      // d8: goto df
      // db: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // de: athrow
      // df: getstatic rip/breeze/EnumType8.STR Lrip/breeze/EnumType8;
      // e2: areturn
      // e3: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e6: athrow
      // e7: ldc org/mozilla/javascript/Scriptable
      // e9: aload 0
      // ea: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // ed: ifeq f8
      // f0: getstatic rip/breeze/EnumType8.SCRIPTABLE Lrip/breeze/EnumType8;
      // f3: areturn
      // f4: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f7: athrow
      // f8: getstatic rip/breeze/EnumType8.OTHER Lrip/breeze/EnumType8;
      // fb: areturn
      // try (0 -> 6): 7 java/lang/RuntimeException
      // try (3 -> 11): 11 java/lang/RuntimeException
      // try (13 -> 19): 20 java/lang/RuntimeException
      // try (16 -> 24): 24 java/lang/RuntimeException
      // try (26 -> 32): 33 java/lang/RuntimeException
      // try (29 -> 38): 39 java/lang/RuntimeException
      // try (35 -> 44): 45 java/lang/RuntimeException
      // try (41 -> 50): 51 java/lang/RuntimeException
      // try (47 -> 56): 57 java/lang/RuntimeException
      // try (53 -> 61): 61 java/lang/RuntimeException
      // try (63 -> 69): 70 java/lang/RuntimeException
      // try (66 -> 74): 74 java/lang/RuntimeException
      // try (76 -> 82): 83 java/lang/RuntimeException
      // try (79 -> 87): 87 java/lang/RuntimeException
      // try (89 -> 96): 97 java/lang/RuntimeException
      // try (92 -> 101): 101 java/lang/RuntimeException
      // try (103 -> 109): 109 java/lang/RuntimeException
   }

   private static MethodHandle getMethodHandle(Lookup var0, Method var1) {
      long var2 = 30561791400270L;

      try {
         var1.setAccessible(true);
         return var0.unreflect(var1);
      } catch (IllegalAccessException var5) {
         throw Context.reportRuntimeError(
            "Cannot bind method " + var1 + ": " + var5.getMessage()
         );
      }
   }

   private static MethodHandle getMethodHandle_2(MethodHandle var0) {
      MethodType var1 = var0.type();
      if (var1.returnType() == void.class) {
         MethodHandle var2 = MethodHandles.constant(Object.class, Undefined.instance);
         MethodHandle var3 = MethodHandles.dropArguments(var2, 0, var1.parameterArray());
         return MethodHandles.foldArguments(var3, var0);
      } else {
         return var0.asType(var1.changeReturnType(Object.class));
      }
   }

   private static <T extends Util135> T getDataBuilder19(Context var0, Class<T> var1, Object[] var2, List<Util31> var3) throws Throwable {
      long var4 = 7466422887629L;

      try {
         if (var3.isEmpty()) {
            throw Context.reportRuntimeError(buildString(var1) + " cannot be constructed: no constructor available.");
         }
      } catch (Throwable var12) {
         throw getThrowable(var12);
      }

      int var10000;
      label45: {
         try {
            if (var2 == null) {
               var10000 = 0;
               break label45;
            }
         } catch (Throwable var14) {
            throw getThrowable(var14);
         }

         var10000 = var2.length;
      }

      int var6 = var10000;

      for (Util31 var8 : var3) {
         try {
            if (var6 != var8.arr_b.length) {
               continue;
            }
         } catch (Throwable var13) {
            throw getThrowable(var13);
         }

         Object[] var9 = callFunction(var0, var2, var8.arr_b, var8.constructor_a.getParameterTypes());
         if (var9 != null) {
            MethodHandle var10 = MethodHandles.publicLookup().unreflectConstructor(var8.constructor_a);
            return (T)var10.invokeWithArguments(var9);
         }
      }

      throw Context.reportRuntimeError(
         "Cannot construct "
            + buildString(var1)
            + " with arguments "
            + buildString_5(var2)
            + "."
      );
   }

   private static Object[] callFunction(Context param0, Object[] param1, EnumType8[] param2, Class<?>[] param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 2
      // 01: arraylength
      // 02: istore 4
      // 04: iload 4
      // 06: anewarray 4
      // 09: astore 5
      // 0b: bipush 0
      // 0c: istore 6
      // 0e: iload 6
      // 10: iload 4
      // 12: if_icmpge 75
      // 15: aload 1
      // 16: ifnull 39
      // 19: goto 20
      // 1c: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: iload 6
      // 22: aload 1
      // 23: arraylength
      // 24: if_icmpge 39
      // 27: goto 2e
      // 2a: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: iload 6
      // 31: aaload
      // 32: goto 3c
      // 35: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: getstatic org/mozilla/javascript/Undefined.instance Ljava/lang/Object;
      // 3c: astore 7
      // 3e: aload 5
      // 40: iload 6
      // 42: aload 0
      // 43: aload 7
      // 45: aload 2
      // 46: iload 6
      // 48: aaload
      // 49: aload 3
      // 4a: ifnull 58
      // 4d: aload 3
      // 4e: iload 6
      // 50: aaload
      // 51: goto 5a
      // 54: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: ldc java/lang/Object
      // 5a: invokestatic rip/breeze/Util135.getObject (Lorg/mozilla/javascript/Context;Ljava/lang/Object;Lrip/breeze/EnumType8;Ljava/lang/Class;)Ljava/lang/Object;
      // 5d: aastore
      // 5e: aload 5
      // 60: iload 6
      // 62: aaload
      // 63: getstatic rip/breeze/Util135.CONST_H Ljava/lang/Object;
      // 66: if_acmpne 6f
      // 69: aconst_null
      // 6a: areturn
      // 6b: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: iinc 6 1
      // 72: goto 0e
      // 75: aload 5
      // 77: areturn
      // try (8 -> 13): 14 java/lang/RuntimeException
      // try (11 -> 20): 21 java/lang/RuntimeException
      // try (16 -> 27): 27 java/lang/RuntimeException
      // try (31 -> 44): 44 java/lang/RuntimeException
      // try (47 -> 56): 56 java/lang/RuntimeException
   }

   private static Object getObject(Context var0, Object var1, EnumType8 var2, Class<?> var3) {
      try {
         switch (Util29.CONST_B[var2.ordinal()]) {
            case 1:
               return ScriptRuntime.toNumber(var1);
            case 2:
               return (float)ScriptRuntime.toNumber(var1);
            case 3:
               return ScriptRuntime.toInt32(var1);
            case 4:
               return (long)ScriptRuntime.toNumber(var1);
            case 5:
               return ScriptRuntime.toBoolean(var1);
            case 6:
               return ScriptRuntime.toString(var1);
            case 7:
               return var1;
            case 8:
               break;
            default:
               return CONST_H;
         }
      } catch (RuntimeException var7) {
         throw getThrowable(var7);
      }

      try {
         Object var4 = Context.jsToJava(var1, var3);

         try {
            if (var4 == null && var3.isPrimitive()) {
               return CONST_H;
            }
         } catch (RuntimeException var5) {
            throw getThrowable(var5);
         }

         return var4;
      } catch (RuntimeException var6) {
         return CONST_H;
      }
   }

   private static Object getObject_2(Object param0, Scriptable param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 12
      // 04: aload 0
      // 05: getstatic org/mozilla/javascript/Undefined.instance Ljava/lang/Object;
      // 08: if_acmpne 1a
      // 0b: goto 12
      // 0e: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: getstatic org/mozilla/javascript/Undefined.instance Ljava/lang/Object;
      // 15: areturn
      // 16: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 0
      // 1b: instanceof rip/breeze/Util135
      // 1e: ifeq 2e
      // 21: aload 0
      // 22: checkcast rip/breeze/Util135
      // 25: invokespecial rip/breeze/Util135.processAll ()V
      // 28: aload 0
      // 29: areturn
      // 2a: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: instanceof java/util/Collection
      // 32: ifeq 66
      // 35: aload 1
      // 36: invokestatic org/mozilla/javascript/ScriptableObject.getTopLevelScope (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 39: astore 2
      // 3a: aload 0
      // 3b: checkcast java/util/Collection
      // 3e: invokeinterface java/util/Collection.stream ()Ljava/util/stream/Stream; 1
      // 43: new rip/breeze/FuncUtil2
      // 46: dup
      // 47: aload 2
      // 48: invokespecial rip/breeze/FuncUtil2.<init> (Lorg/mozilla/javascript/Scriptable;)V
      // 4b: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 50: new rip/breeze/FuncUtil1
      // 53: dup
      // 54: invokespecial rip/breeze/FuncUtil1.<init> ()V
      // 57: invokeinterface java/util/stream/Stream.toArray (Ljava/util/function/IntFunction;)[Ljava/lang/Object; 2
      // 5c: astore 3
      // 5d: invokestatic org/mozilla/javascript/Context.getCurrentContext ()Lorg/mozilla/javascript/Context;
      // 60: aload 2
      // 61: aload 3
      // 62: invokevirtual org/mozilla/javascript/Context.newArray (Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;
      // 65: areturn
      // 66: aload 0
      // 67: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 6a: invokevirtual java/lang/Class.isArray ()Z
      // 6d: ifeq de
      // 70: aload 0
      // 71: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 74: istore 2
      // 75: iload 2
      // 76: anewarray 4
      // 79: astore 3
      // 7a: aload 1
      // 7b: invokestatic org/mozilla/javascript/ScriptableObject.getTopLevelScope (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 7e: astore 4
      // 80: bipush 0
      // 81: istore 5
      // 83: iload 5
      // 85: iload 2
      // 86: if_icmpge d4
      // 89: aload 0
      // 8a: iload 5
      // 8c: invokestatic java/lang/reflect/Array.get (Ljava/lang/Object;I)Ljava/lang/Object;
      // 8f: astore 6
      // 91: aload 6
      // 93: instanceof rip/breeze/Util135
      // 96: ifeq ae
      // 99: aload 6
      // 9b: checkcast rip/breeze/Util135
      // 9e: invokespecial rip/breeze/Util135.processAll ()V
      // a1: aload 3
      // a2: iload 5
      // a4: aload 6
      // a6: aastore
      // a7: goto ce
      // aa: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ad: athrow
      // ae: aload 6
      // b0: instanceof org/mozilla/javascript/Scriptable
      // b3: ifeq c3
      // b6: aload 3
      // b7: iload 5
      // b9: aload 6
      // bb: aastore
      // bc: goto ce
      // bf: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2: athrow
      // c3: aload 3
      // c4: iload 5
      // c6: aload 6
      // c8: aload 4
      // ca: invokestatic org/mozilla/javascript/Context.javaToJS (Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;
      // cd: aastore
      // ce: iinc 5 1
      // d1: goto 83
      // d4: invokestatic org/mozilla/javascript/Context.getCurrentContext ()Lorg/mozilla/javascript/Context;
      // d7: aload 4
      // d9: aload 3
      // da: invokevirtual org/mozilla/javascript/Context.newArray (Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;
      // dd: areturn
      // de: aload 0
      // df: instanceof org/mozilla/javascript/Scriptable
      // e2: ifeq eb
      // e5: aload 0
      // e6: areturn
      // e7: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ea: athrow
      // eb: aload 0
      // ec: aload 1
      // ed: invokestatic org/mozilla/javascript/ScriptableObject.getTopLevelScope (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // f0: invokestatic org/mozilla/javascript/Context.javaToJS (Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;
      // f3: areturn
      // try (0 -> 5): 6 java/lang/RuntimeException
      // try (2 -> 10): 10 java/lang/RuntimeException
      // try (12 -> 20): 20 java/lang/RuntimeException
      // try (68 -> 79): 79 java/lang/RuntimeException
      // try (81 -> 89): 89 java/lang/RuntimeException
      // try (104 -> 109): 109 java/lang/RuntimeException
   }

   private static RuntimeException getRuntimeException(String var0, Throwable var1) {
      if (var1 instanceof RhinoException) {
         String var4 = ((RhinoException)var1).details();
         return Context.reportRuntimeError(var0 + var4);
      }

      String var2 = var1.getMessage();

      StringBuilder var10000;
      try {
         var10000 = new StringBuilder().append(var0);
         if (var2 != null) {
            return Context.reportRuntimeError(var10000.append(var2).toString());
         }
      } catch (RuntimeException var3) {
         throw getThrowable(var3);
      }

      return Context.reportRuntimeError(var10000.append(var1.toString()).toString());
   }

   private static String buildString_2(String param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 1a
      // 04: aload 0
      // 05: invokevirtual java/lang/String.isEmpty ()Z
      // 08: ifne 1a
      // 0b: goto 12
      // 0e: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 0
      // 13: goto 1b
      // 16: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 1
      // 1b: areturn
      // try (0 -> 5): 6 java/lang/RuntimeException
      // try (2 -> 10): 10 java/lang/RuntimeException
   }

   private static String buildString_3(Method param0, JSGetter param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/Util135.101690052097789L J
      // 03: ldc2_w 5182834366368
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: invokeinterface org/mozilla/javascript/annotations/JSGetter.value ()Ljava/lang/String; 1
      // 0e: astore 4
      // 10: aload 4
      // 12: ifnull 2b
      // 15: aload 4
      // 17: invokevirtual java/lang/String.isEmpty ()Z
      // 1a: ifne 2b
      // 1d: goto 24
      // 20: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 4
      // 26: areturn
      // 27: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 2f: astore 5
      // 31: aload 5
      // 33: sipush 25769
      // 36: ldc2_w 6058022174887070791
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 43: ifeq 7e
      // 46: aload 5
      // 48: invokevirtual java/lang/String.length ()I
      // 4b: bipush 3
      // 4c: if_icmple 7e
      // 4f: goto 56
      // 52: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 5
      // 58: bipush 3
      // 59: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 5c: astore 6
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: aload 6
      // 67: bipush 0
      // 68: invokevirtual java/lang/String.charAt (I)C
      // 6b: invokestatic java/lang/Character.toLowerCase (C)C
      // 6e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 71: aload 6
      // 73: bipush 1
      // 74: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d: areturn
      // 7e: aload 5
      // 80: areturn
      // try (7 -> 12): 13 java/lang/RuntimeException
      // try (9 -> 17): 17 java/lang/RuntimeException
      // try (22 -> 34): 35 java/lang/RuntimeException
   }

   private static String buildString_4(String var0) {
      long var1 = 122796262815424L;

      try {
         if (!var0.startsWith("set") || var0.length() <= 3) {
            return var0;
         }
      } catch (RuntimeException var4) {
         throw getThrowable(var4);
      }

      String var3 = var0.substring(3);
      return Character.toLowerCase(var3.charAt(0)) + var3.substring(1);
   }

   private static String buildString_5(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/Util135.101690052097789L J
      // 03: ldc2_w 57026852988964
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: ifnull 18
      // 0c: aload 0
      // 0d: arraylength
      // 0e: ifne 2a
      // 11: goto 18
      // 14: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: sipush 4901
      // 1b: ldc2_w 5498710326905652315
      // 1e: lload 1
      // 1f: lxor
      // 20: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: areturn
      // 26: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: new java/lang/StringBuilder
      // 2d: dup
      // 2e: ldc_w "("
      // 31: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 34: astore 3
      // 35: bipush 0
      // 36: istore 4
      // 38: iload 4
      // 3a: aload 0
      // 3b: arraylength
      // 3c: if_icmpge 76
      // 3f: iload 4
      // 41: ifle 64
      // 44: goto 4b
      // 47: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 3
      // 4c: sipush 9087
      // 4f: ldc2_w 2902806883128669194
      // 52: lload 1
      // 53: lxor
      // 54: invokedynamic h (IJ)Ljava/lang/String; bsm=rip/breeze/Util135.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: pop
      // 5d: goto 64
      // 60: invokestatic rip/breeze/Util135.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 3
      // 65: aload 0
      // 66: iload 4
      // 68: aaload
      // 69: invokestatic rip/breeze/Util135.getString (Ljava/lang/Object;)Ljava/lang/String;
      // 6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f: pop
      // 70: iinc 4 1
      // 73: goto 38
      // 76: aload 3
      // 77: ldc_w ")"
      // 7a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 80: areturn
      // try (4 -> 9): 10 java/lang/RuntimeException
      // try (6 -> 18): 18 java/lang/RuntimeException
      // try (27 -> 33): 34 java/lang/RuntimeException
      // try (31 -> 44): 45 java/lang/RuntimeException
   }

   private static String getString(Object var0) {
      long var1 = 103500618024722L;

      try {
         if (var0 == Undefined.instance) {
            return "undefined";
         }
      } catch (RuntimeException var9) {
         throw getThrowable(var9);
      }

      try {
         if (var0 == null) {
            return "null";
         }
      } catch (RuntimeException var5) {
         throw getThrowable(var5);
      }

      try {
         if (var0 instanceof CharSequence) {
            return "string";
         }
      } catch (RuntimeException var8) {
         throw getThrowable(var8);
      }

      try {
         if (var0 instanceof Number) {
            return "number";
         }
      } catch (RuntimeException var4) {
         throw getThrowable(var4);
      }

      try {
         if (var0 instanceof Boolean) {
            return "boolean";
         }
      } catch (RuntimeException var7) {
         throw getThrowable(var7);
      }

      try {
         if (var0 instanceof Function) {
            return "function";
         }
      } catch (RuntimeException var3) {
         throw getThrowable(var3);
      }

      try {
         if (var0 instanceof Scriptable) {
            return "object";
         }
      } catch (RuntimeException var6) {
         throw getThrowable(var6);
      }

      return var0.getClass().getSimpleName();
   }

   private static Map lambda$getOrBuildPrototype_Inner0(Scriptable var0) {
      return new ConcurrentHashMap<>();
   }

   static Util135 getDataBuilder19_2(Context var0, Class var1, Object[] var2, List var3) throws Throwable {
      return getDataBuilder19(var0, var1, var2, var3);
   }

   static RuntimeException getRuntimeException_2(String var0, Throwable var1) {
      return getRuntimeException(var0, var1);
   }

   static ScriptObject getScriptObject_2(Class var0) {
      return getScriptObject(var0);
   }

   static String getString_2(String var0, String var1) {
      return buildString_2(var0, var1);
   }

   static EnumType8 getEnum8Val_2(Class var0) {
      return getEnum8Val(var0);
   }

   static MethodHandle getMethodHandle_3(Lookup var0, Method var1) {
      return getMethodHandle(var0, var1);
   }

   static MethodHandle getMethodHandle_4(MethodHandle var0) {
      return getMethodHandle_2(var0);
   }

   static String getString_3(Method var0, JSGetter var1) {
      return buildString_3(var0, var1);
   }

   static String getString_4(String var0) {
      return buildString_4(var0);
   }

   static Object getObject_3(Object var0, Scriptable var1) {
      return getObject_2(var0, var1);
   }

   static Object getObject_4(Context var0, Object var1, EnumType8 var2, Class var3) {
      return getObject(var0, var1, var2, var3);
   }

   static Object[] decrypt(Context var0, Object[] var1, EnumType8[] var2, Class[] var3) {
      return callFunction(var0, var1, var2, var3);
   }

   static void decrypt_1(Util135 var0) {
      var0.processAll();
   }

   static {
      long var0 = 36363727942561L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[32];
      int var5 = 0;
      String var6 = "¶ÒÙ9#<D\tYÑ\u0098¹\u0085ÝäØ\u0010ýYá\u0000ëÿ?\u0097!Jâ\u0094kOák\u0010i_å¬\u0005\u008eô\u00844C#&\u008b0\u0081±\u0010Èä4_~%\u0003\u001a\u0083QÈ\\\u0097ûSc\u0018$¬î\u0012\u009aãTkË\u0098e\u001bi\u0087Ég,\u008b\u0096\u001d¨ë\u0088\u007fpíX\u0090ÀP!\u001e1I²\u000f-[qýwV³1Å\u0081P\u008c);æx\u008d×g\u009f\u0016u\f\u007f=Úu;ÏCH¿Í»b\u0081B\"\u008eïß\u0091\u000fcàì\u0005\u001c,\u0083$]P\u007f\u0088f9fHÆÞ\u0092ÍxÇÿ0>\"»®«FÄçïè¹×\u0082è\u0097ã-E\u0089åçýF\u0084\u001e$;¿<>\u008d«&A(Cñ\u0015_\u0016¢=?Ëò.-Y\u0082\u0005JËk\u0089ñ·È_×´JD:Qã#ÙÛvXr¯<MË\u0018pÉ5\u00ad±\u0092hÝâÀ6-Võ;|çØ)|ÍðÀ\u0087\u0010Ë\u0093i\u0005-«ÊÀ<ºc&s\u009a\u009a^ ÐÔ\u0096ýîñ1\u0093ý3\u0013¬Ïr\u0095o±\u0010\u001b\u000fÇ·\u0090çPÑÛÅÓÝåZ\u0010xvA«;+¸] °ë\u0081ô\u000e~¼ +\u0015ö´ÓPÐÞ@à¹{^\u0002Z¥*Íki¡bU%h´e\u0014,w4ýX}=z©\u0011\u000bá\u001b_pãÌaÛ\u007f\n`!eÙgá\b\u0015Ïp@Ù3'³\u0084\u0010§m5ó¹\u0013²\u0007ö!üÀ ¶\u0006\u00025\u0090\u00835ùä\u0083i1\u001f,/;ù<ÝÄ\u0019!$Ó\u00adZº\u0003\u008cMwÖ\u0093~\u008a?h\u0003\u008eñZ\u0091\u0010\u0084$\u0081,¬DÔl;\u008cý\u0088¶°(\u0019 XKñõñå·\u0013\u0095Ó6öKd\u008fî¬jÏ¶_Ò½?\u001c\u0012S9b{\u000b\u0018(Ð!\u001buCå[+;Ç±FN(¢\u001e1`JÕÏß5\u0013÷ÇÄèb\u0007³\u0013©\u0097\u0084;íÅB\u0098\u0010\u0088\u009f\u0091\u0086ëÖ\u0088ÿÎ\u0084Õ \u0084Õ\u0096\u0091\u0010Ø\u0004s\u008b\u008cª\u0019I¦<\u0080\u0091(ö\f\u007f\u0010\u0091¤Ð\u009fØ\u0094\u0087Ë+¢-ñc@D\f\u0010.~jÀ\u0018 «É#\u00ad\fÇóc!:\u0018\u0099ùí3\u00adß)3R%]1mK\u0012ä\u0098ÀWUd\u001cÑæ\u0010\u008eCô\u009a[`6\u0006\u0099\u009aêi\u0089sç\u009b\u0010\u0003Þéì0eö¶à\u0096\u00055ì\u0004\\\u008b\u0010w\u0015«\u009dØ\u0097oæ@\bd¼K¡\u001câ\u0010\u009d²\u0007ó\u0081Q-6ýJ\u009a\r\u001aÑ\u009a¹@\u001dSê ´ÈQÚe\u0097óË¢u>(\u0092\u0010-\u0090õiø\u0019]Q\u009a\u001d¯\u0010\u0000¡F\u001c#\u001fG=\róó±\\ò\u009f;²[\u009f\u0090¤áºRf°\u0081R\u0081ë`\t59\u0010ûI\u0082Öû\u0004Ä\u0019\u009fÙ\u0013C¥÷s^\u0018,\u001b\u0001Ïº\u0091\u0094¸!y7m·E\u0085¸\u0086Áñ7ó°ôT\u0010¡GÊ\u008f¦'G¸ }\u0012#\u001dVBß(\u0019ÅWD|»\u0012É\u0018ã·w\u0098jèXËÕÆ'N\u009a\u0012\u007fwûh6©wñvK¨\u0087ô\u008a \u00adx";
      int var7 = "¶ÒÙ9#<D\tYÑ\u0098¹\u0085ÝäØ\u0010ýYá\u0000ëÿ?\u0097!Jâ\u0094kOák\u0010i_å¬\u0005\u008eô\u00844C#&\u008b0\u0081±\u0010Èä4_~%\u0003\u001a\u0083QÈ\\\u0097ûSc\u0018$¬î\u0012\u009aãTkË\u0098e\u001bi\u0087Ég,\u008b\u0096\u001d¨ë\u0088\u007fpíX\u0090ÀP!\u001e1I²\u000f-[qýwV³1Å\u0081P\u008c);æx\u008d×g\u009f\u0016u\f\u007f=Úu;ÏCH¿Í»b\u0081B\"\u008eïß\u0091\u000fcàì\u0005\u001c,\u0083$]P\u007f\u0088f9fHÆÞ\u0092ÍxÇÿ0>\"»®«FÄçïè¹×\u0082è\u0097ã-E\u0089åçýF\u0084\u001e$;¿<>\u008d«&A(Cñ\u0015_\u0016¢=?Ëò.-Y\u0082\u0005JËk\u0089ñ·È_×´JD:Qã#ÙÛvXr¯<MË\u0018pÉ5\u00ad±\u0092hÝâÀ6-Võ;|çØ)|ÍðÀ\u0087\u0010Ë\u0093i\u0005-«ÊÀ<ºc&s\u009a\u009a^ ÐÔ\u0096ýîñ1\u0093ý3\u0013¬Ïr\u0095o±\u0010\u001b\u000fÇ·\u0090çPÑÛÅÓÝåZ\u0010xvA«;+¸] °ë\u0081ô\u000e~¼ +\u0015ö´ÓPÐÞ@à¹{^\u0002Z¥*Íki¡bU%h´e\u0014,w4ýX}=z©\u0011\u000bá\u001b_pãÌaÛ\u007f\n`!eÙgá\b\u0015Ïp@Ù3'³\u0084\u0010§m5ó¹\u0013²\u0007ö!üÀ ¶\u0006\u00025\u0090\u00835ùä\u0083i1\u001f,/;ù<ÝÄ\u0019!$Ó\u00adZº\u0003\u008cMwÖ\u0093~\u008a?h\u0003\u008eñZ\u0091\u0010\u0084$\u0081,¬DÔl;\u008cý\u0088¶°(\u0019 XKñõñå·\u0013\u0095Ó6öKd\u008fî¬jÏ¶_Ò½?\u001c\u0012S9b{\u000b\u0018(Ð!\u001buCå[+;Ç±FN(¢\u001e1`JÕÏß5\u0013÷ÇÄèb\u0007³\u0013©\u0097\u0084;íÅB\u0098\u0010\u0088\u009f\u0091\u0086ëÖ\u0088ÿÎ\u0084Õ \u0084Õ\u0096\u0091\u0010Ø\u0004s\u008b\u008cª\u0019I¦<\u0080\u0091(ö\f\u007f\u0010\u0091¤Ð\u009fØ\u0094\u0087Ë+¢-ñc@D\f\u0010.~jÀ\u0018 «É#\u00ad\fÇóc!:\u0018\u0099ùí3\u00adß)3R%]1mK\u0012ä\u0098ÀWUd\u001cÑæ\u0010\u008eCô\u009a[`6\u0006\u0099\u009aêi\u0089sç\u009b\u0010\u0003Þéì0eö¶à\u0096\u00055ì\u0004\\\u008b\u0010w\u0015«\u009dØ\u0097oæ@\bd¼K¡\u001câ\u0010\u009d²\u0007ó\u0081Q-6ýJ\u009a\r\u001aÑ\u009a¹@\u001dSê ´ÈQÚe\u0097óË¢u>(\u0092\u0010-\u0090õiø\u0019]Q\u009a\u001d¯\u0010\u0000¡F\u001c#\u001fG=\róó±\\ò\u009f;²[\u009f\u0090¤áºRf°\u0081R\u0081ë`\t59\u0010ûI\u0082Öû\u0004Ä\u0019\u009fÙ\u0013C¥÷s^\u0018,\u001b\u0001Ïº\u0091\u0094¸!y7m·E\u0085¸\u0086Áñ7ó°ôT\u0010¡GÊ\u008f¦'G¸ }\u0012#\u001dVBß(\u0019ÅWD|»\u0012É\u0018ã·w\u0098jèXËÕÆ'N\u009a\u0012\u007fwûh6©wñvK¨\u0087ô\u008a \u00adx"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_6(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_S = var4;
                     CONST_T = new String[32];
                     CONST_D = new ConcurrentHashMap<>();
                     CONST_E = Collections.synchronizedMap(new WeakHashMap<>());
                     CONST_F = new ConcurrentHashMap<>();
                     CONST_G = new ClassValueCache();
                     CONST_H = new Object();
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

                  var6 = "RZâI\u0090½1[7Ø\u007fª\u008aÔ\u0082\u0007 Q\u0017£\u001b¯\u001a!\u0013§»ÝE¥¨ª«\u0099E&\u0019ÆÙ\u0089åT\u009bêk8\u000eµË";
                  var7 = "RZâI\u0090½1[7Ø\u007fª\u008aÔ\u0082\u0007 Q\u0017£\u001b¯\u001a!\u0013§»ÝE¥¨ª«\u0099E&\u0019ÆÙ\u0089åT\u009bêk8\u000eµË".length();
                  var8 = 16;
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

   private static String buildString_6(byte[] var0) {
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

   private static String buildString_7(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18852;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aV", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString_6(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
   }

   private static Object getObject_5(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_7(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject_5".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/aV" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
