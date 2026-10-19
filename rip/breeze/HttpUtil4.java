package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;

public abstract class HttpUtil4 implements Scriptable {
   private static volatile WeakReference<Scriptable> weakReference_a;
   private static final Map<Scriptable, Map<Class<?>, WeakReference<ScriptableObject>>> CONST_B;
   private static final ClassValue<Util20> CONST_C;
   private Scriptable scriptable_d;
   private Scriptable scriptable_e;
   private final Map<String, Object> map_f = new LinkedHashMap<>();
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   public static synchronized void initialize(Context var0, Scriptable var1) {
      Scriptable var2 = ScriptableObject.getTopLevelScope(var1);
      weakReference_a = new WeakReference<>(var2);
   }

   public static void processAll(Scriptable var0) {
      Scriptable var1 = ScriptableObject.getTopLevelScope(var0);
      synchronized (CONST_B) {
         CONST_B.remove(var1);
      }
   }

   public static synchronized void processAll_2() {
      synchronized (CONST_B) {
         CONST_B.clear();
      }

      weakReference_a = null;
   }

   public static void processAll_3(Scriptable param0, Class<? extends HttpUtil4> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic org/mozilla/javascript/ScriptableObject.getTopLevelScope (Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;
      // 04: astore 2
      // 05: getstatic rip/breeze/HttpUtil4.CONST_B Ljava/util/Map;
      // 08: dup
      // 09: astore 3
      // 0a: monitorenter
      // 0b: getstatic rip/breeze/HttpUtil4.CONST_B Ljava/util/Map;
      // 0e: aload 2
      // 0f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 14: checkcast java/util/Map
      // 17: astore 4
      // 19: aload 4
      // 1b: ifnull 30
      // 1e: aload 4
      // 20: aload 1
      // 21: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 26: checkcast java/lang/ref/WeakReference
      // 29: goto 31
      // 2c: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: aconst_null
      // 31: astore 5
      // 33: aload 3
      // 34: monitorexit
      // 35: goto 3f
      // 38: astore 6
      // 3a: aload 3
      // 3b: monitorexit
      // 3c: aload 6
      // 3e: athrow
      // 3f: aload 5
      // 41: ifnull 53
      // 44: aload 5
      // 46: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 49: checkcast org/mozilla/javascript/ScriptableObject
      // 4c: goto 54
      // 4f: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 52: athrow
      // 53: aconst_null
      // 54: astore 3
      // 55: aload 3
      // 56: ifnull 72
      // 59: aload 3
      // 5a: invokevirtual org/mozilla/javascript/ScriptableObject.isSealed ()Z
      // 5d: ifne 72
      // 60: goto 67
      // 63: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 66: athrow
      // 67: aload 3
      // 68: invokevirtual org/mozilla/javascript/ScriptableObject.sealObject ()V
      // 6b: goto 72
      // 6e: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 71: athrow
      // 72: return
      // try (12 -> 19): 19 java/lang/RuntimeException
      // try (7 -> 25): 26 null
      // try (26 -> 29): 26 null
      // try (31 -> 37): 37 java/lang/RuntimeException
      // try (41 -> 46): 47 java/lang/RuntimeException
      // try (43 -> 51): 52 java/lang/RuntimeException
   }

   public final void processAll_4() {
      Scriptable var10000;
      label69: {
         try {
            if (weakReference_a != null) {
               var10000 = weakReference_a.get();
               break label69;
            }
         } catch (RuntimeException var9) {
            throw getRuntimeException(var9);
         }

         var10000 = null;
      }

      Scriptable var1 = var10000;

      try {
         if (var1 == null) {
            return;
         }
      } catch (RuntimeException var8) {
         throw getRuntimeException(var8);
      }

      Map var3;
      synchronized (CONST_B) {
         var3 = CONST_B.get(var1);
         if (var3 == null) {
            var3 = new HashMap();
            CONST_B.put(var1, var3);
         }
      }

      ScriptableObject var10 = null;
      WeakReference var4 = (WeakReference)var3.get(this.getClass());
      if (var4 != null) {
         var10 = (ScriptableObject)var4.get();
      }

      if (var10 == null) {
         var10 = getScriptableObject(CONST_C.get(this.getClass()), var1);
         var3.put(this.getClass(), new WeakReference<>(var10));
      }

      try {
         if (this.getParentScope() != var1) {
            this.setParentScope(var1);
         }
      } catch (RuntimeException var6) {
         throw getRuntimeException(var6);
      }

      try {
         if (this.getPrototype() != var10) {
            this.setPrototype(var10);
         }
      } catch (RuntimeException var5) {
         throw getRuntimeException(var5);
      }
   }

   public static void processNullable(Object[] var0) {
      try {
         if (var0 == null) {
            return;
         }
      } catch (RuntimeException var6) {
         throw getRuntimeException(var6);
      }

      for (Object var4 : var0) {
         try {
            if (var4 instanceof HttpUtil4) {
               ((HttpUtil4)var4).processAll_4();
            }
         } catch (RuntimeException var5) {
            throw getRuntimeException(var5);
         }
      }
   }

   private static ScriptableObject getScriptableObject(Util20 var0, Scriptable var1) {
      Scriptable var2 = ScriptableObject.getObjectPrototype(var1);
      Scriptable var3 = ScriptableObject.getFunctionPrototype(var1);
      NativeObject var4 = new NativeObject();
      var4.setParentScope(var1);
      var4.setPrototype(var2);

      for (Util19 var6 : var0.map_d.values()) {
         byte var10000;
         byte var10001;
         label44: {
            try {
               var10000 = 6;
               if (var6.method_c == null) {
                  var10001 = 1;
                  break label44;
               }
            } catch (RuntimeException var10) {
               throw getRuntimeException(var10);
            }

            var10001 = 0;
         }

         int var7 = var10000 | var10001;
         var4.defineProperty(var6.string_a, null, var6.method_b, var6.method_c, var7);
      }

      LinkedHashMap var11 = new LinkedHashMap();

      for (Util21 var14 : var0.list_c) {
         var11.computeIfAbsent(var14.string_b, HttpUtil4::lambda$buildPrototype_Inner0).add(var14);
      }

      for (Entry var15 : var11.entrySet()) {
         BaseFunction var9;
         if (((List)var15.getValue()).size() == 1) {
            Util21 var8 = (Util21)((List)var15.getValue()).get(0);
            var9 = new MathUtil3(var8.string_b, var8.fieldInt_e, var8, var3, var1);
         } else {
            var9 = new PlayerUtil8((String)var15.getKey(), (List<Util21>)var15.getValue(), var3, var1);
         }

         ScriptableObject.defineProperty(var4, (String)var15.getKey(), var9, 2);
      }

      return var4;
   }

   protected HttpUtil4() {
      Scriptable var1 = weakReference_a != null ? weakReference_a.get() : null;

      try {
         if (var1 != null) {
            this.processAll_4();
         }
      } catch (RuntimeException var2) {
         throw getRuntimeException(var2);
      }
   }

   @Override
   public Scriptable getPrototype() {
      return this.scriptable_d;
   }

   @Override
   public void setPrototype(Scriptable var1) {
      this.scriptable_d = var1;
   }

   @Override
   public Scriptable getParentScope() {
      return this.scriptable_e;
   }

   @Override
   public void setParentScope(Scriptable var1) {
      this.scriptable_e = var1;
   }

   @Override
   public Object get(String var1, Scriptable var2) {
      Object var3 = this.map_f.get(var1);

      try {
         if (var3 == null) {
            return Scriptable.NOT_FOUND;
         }
      } catch (RuntimeException var4) {
         throw getRuntimeException(var4);
      }

      return var3;
   }

   @Override
   public Object get(int var1, Scriptable var2) {
      return Scriptable.NOT_FOUND;
   }

   @Override
   public boolean has(String var1, Scriptable var2) {
      return this.map_f.containsKey(var1);
   }

   @Override
   public boolean has(int var1, Scriptable var2) {
      return false;
   }

   @Override
   public void put(String var1, Scriptable var2, Object var3) {
      this.map_f.put(var1, var3);
   }

   @Override
   public void put(int var1, Scriptable var2, Object var3) {
   }

   @Override
   public void delete(String var1) {
      this.map_f.remove(var1);
   }

   @Override
   public void delete(int var1) {
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
      // 00: aload 1
      // 01: ifnull 11
      // 04: aload 1
      // 05: ldc java/lang/String
      // 07: if_acmpne 33
      // 0a: goto 11
      // 0d: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10: athrow
      // 11: new java/lang/StringBuilder
      // 14: dup
      // 15: invokespecial java/lang/StringBuilder.<init> ()V
      // 18: ldc_w "["
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual rip/breeze/HttpUtil4.getClassName ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc_w "]"
      // 28: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e: areturn
      // 2f: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 0
      // 34: areturn
      // try (0 -> 5): 6 java/lang/RuntimeException
      // try (2 -> 20): 20 java/lang/RuntimeException
   }

   @Override
   public boolean hasInstance(Scriptable var1) {
      return ScriptRuntime.jsDelegatesTo(var1, this);
   }

   @Override
   public Object[] getIds() {
      return this.map_f.keySet().toArray(new Object[0]);
   }

   @Override
   public abstract String getClassName();

   private static Object getObject(Scriptable var0, Class<?> var1) {
      long var2 = 67742489269638L;

      try {
         if (!var1.isInstance(var0)) {
            throw Context.reportRuntimeError("Invalid this. Expected " + var1.getName());
         } else {
            return var0;
         }
      } catch (RuntimeException var4) {
         throw getRuntimeException(var4);
      }
   }

   private static Object[] castArray(Object[] var0, Class<?>[] var1) {
      return Util35.castArray(var0, var1);
   }

   private static Util20 getBreezeUtil17(Class<?> var0) {
      Lookup var1 = MethodHandles.lookup();
      ArrayList var2 = new ArrayList();
      LinkedHashMap var3 = new LinkedHashMap();

      for (Method var7 : var0.getMethods()) {
         try {
            if (var7.isSynthetic()) {
               continue;
            }
         } catch (RuntimeException var13) {
            throw getRuntimeException(var13);
         }

         JSGetter var8 = var7.getAnnotation(JSGetter.class);
         if (var8 != null) {
            String var9 = buildString_2(var7, var8);
            var3.computeIfAbsent(var9, HttpUtil4::lambda$scan_Inner1).method_b = var7;
         } else {
            JSSetter var14 = var7.getAnnotation(JSSetter.class);
            if (var14 != null) {
               String var10 = buildString_3(var7, var14);
               var3.computeIfAbsent(var10, HttpUtil4::lambda$scan_Inner2).method_c = var7;
            } else {
               JSFunction var15 = var7.getAnnotation(JSFunction.class);
               if (var15 != null) {
                  String var11 = buildString(var7, var15);
                  boolean var12 = Modifier.isStatic(var7.getModifiers());
                  var2.add(new Util21(var0, var11, getMethodHandle(var1, var7), var7.getParameterTypes(), var7.getParameterCount(), var12));
               }
            }
         }
      }

      return new Util20(var0, var0.getSimpleName(), var2, var3);
   }

   private static MethodHandle getMethodHandle(Lookup var0, Method var1) {
      try {
         var1.setAccessible(true);
         return var0.unreflect(var1);
      } catch (IllegalAccessException var3) {
         throw new RuntimeException(var3);
      }
   }

   private static String buildString(Method param0, JSFunction param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokeinterface org/mozilla/javascript/annotations/JSFunction.value ()Ljava/lang/String; 1
      // 06: astore 2
      // 07: aload 2
      // 08: ifnull 19
      // 0b: aload 2
      // 0c: invokevirtual java/lang/String.isEmpty ()Z
      // 0f: ifeq 24
      // 12: goto 19
      // 15: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 1d: goto 25
      // 20: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 2
      // 25: areturn
      // try (3 -> 8): 9 java/lang/RuntimeException
      // try (5 -> 14): 14 java/lang/RuntimeException
   }

   private static String buildString_2(Method param0, JSGetter param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/HttpUtil4.19911944344555L J
      // 03: ldc2_w 115466126001139
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
      // 20: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 4
      // 26: areturn
      // 27: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 2f: astore 5
      // 31: aload 5
      // 33: sipush 24959
      // 36: ldc2_w 3135276098546595290
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil4.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 43: ifeq 8f
      // 46: aload 5
      // 48: invokevirtual java/lang/String.length ()I
      // 4b: bipush 3
      // 4c: if_icmple 8f
      // 4f: goto 56
      // 52: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 5
      // 58: bipush 3
      // 59: invokevirtual java/lang/String.charAt (I)C
      // 5c: invokestatic java/lang/Character.toLowerCase (C)C
      // 5f: istore 6
      // 61: aload 5
      // 63: invokevirtual java/lang/String.length ()I
      // 66: bipush 4
      // 67: if_icmpne 76
      // 6a: iload 6
      // 6c: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 6f: goto 8e
      // 72: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 75: athrow
      // 76: new java/lang/StringBuilder
      // 79: dup
      // 7a: invokespecial java/lang/StringBuilder.<init> ()V
      // 7d: iload 6
      // 7f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 82: aload 5
      // 84: bipush 4
      // 85: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8e: areturn
      // 8f: aload 5
      // 91: areturn
      // try (7 -> 12): 13 java/lang/RuntimeException
      // try (9 -> 17): 17 java/lang/RuntimeException
      // try (22 -> 34): 35 java/lang/RuntimeException
      // try (42 -> 49): 49 java/lang/RuntimeException
   }

   private static String buildString_3(Method param0, JSSetter param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/HttpUtil4.19911944344555L J
      // 03: ldc2_w 79371076177317
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: invokeinterface org/mozilla/javascript/annotations/JSSetter.value ()Ljava/lang/String; 1
      // 0e: astore 4
      // 10: aload 4
      // 12: ifnull 2b
      // 15: aload 4
      // 17: invokevirtual java/lang/String.isEmpty ()Z
      // 1a: ifne 2b
      // 1d: goto 24
      // 20: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 4
      // 26: areturn
      // 27: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 2f: astore 5
      // 31: aload 5
      // 33: sipush 26265
      // 36: ldc2_w 2109312070480034921
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil4.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 43: ifeq 8f
      // 46: aload 5
      // 48: invokevirtual java/lang/String.length ()I
      // 4b: bipush 3
      // 4c: if_icmple 8f
      // 4f: goto 56
      // 52: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 5
      // 58: bipush 3
      // 59: invokevirtual java/lang/String.charAt (I)C
      // 5c: invokestatic java/lang/Character.toLowerCase (C)C
      // 5f: istore 6
      // 61: aload 5
      // 63: invokevirtual java/lang/String.length ()I
      // 66: bipush 4
      // 67: if_icmpne 76
      // 6a: iload 6
      // 6c: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 6f: goto 8e
      // 72: invokestatic rip/breeze/HttpUtil4.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 75: athrow
      // 76: new java/lang/StringBuilder
      // 79: dup
      // 7a: invokespecial java/lang/StringBuilder.<init> ()V
      // 7d: iload 6
      // 7f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 82: aload 5
      // 84: bipush 4
      // 85: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8e: areturn
      // 8f: aload 5
      // 91: areturn
      // try (7 -> 12): 13 java/lang/RuntimeException
      // try (9 -> 17): 17 java/lang/RuntimeException
      // try (22 -> 34): 35 java/lang/RuntimeException
      // try (42 -> 49): 49 java/lang/RuntimeException
   }

   private static Util19 lambda$scan_Inner2(String var0) {
      return new Util19(var0);
   }

   private static Util19 lambda$scan_Inner1(String var0) {
      return new Util19(var0);
   }

   private static List lambda$buildPrototype_Inner0(String var0) {
      return new ArrayList<>();
   }

   static Util20 getBreezeUtil17_2(Class var0) {
      return getBreezeUtil17(var0);
   }

   static Object getObject_2(Scriptable var0, Class var1) {
      return getObject(var0, var1);
   }

   static Object[] decrypt(Object[] var0, Class[] var1) {
      return castArray(var0, var1);
   }

   static {
      long var0 = 136813995675105L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "\u0094Åb3Ñ\u0018C+¬sN\u0096ïÉp0\u009dþCÇÌL±IV\u001fÆ\u0083q\u0003Eç\u008aÜ£0\u0000×\u0082\u008b\u0010kN\u008fz\u009f\u0018\u00adc)c\u0096\u0095Û]ÇÉ\u0010óá/Ü+Ê\u0002Çø\u001eIg.:\u0081G";
      int var7 = "\u0094Åb3Ñ\u0018C+¬sN\u0096ïÉp0\u009dþCÇÌL±IV\u001fÆ\u0083q\u0003Eç\u008aÜ£0\u0000×\u0082\u008b\u0010kN\u008fz\u009f\u0018\u00adc)c\u0096\u0095Û]ÇÉ\u0010óá/Ü+Ê\u0002Çø\u001eIg.:\u0081G"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString_4(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_G = var4;
            CONST_H = new String[3];
            CONST_B = Collections.synchronizedMap(new WeakHashMap<>());
            CONST_C = new ClassValueCache();
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static RuntimeException getRuntimeException(RuntimeException var0) {
      return var0;
   }

   private static String buildString_4(byte[] var0) {
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

   private static String buildString_5(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1212;
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
            throw new RuntimeException("rip/breeze/aK", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_G[var3].getBytes("ISO-8859-1");
         CONST_H[var3] = buildString_4(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
   }

   private static Object getObject_3(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_5(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject_3".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/aK" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
