package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Wrapper;

public abstract class Util132<T> extends Util135 implements Wrapper {
   protected final T object_i;
   private static final ConcurrentHashMap<Class<?>, Util34> CONST_J;
   private static final ConcurrentHashMap<Class<?>, Util34> CONST_K;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   protected Util132(T var1) {
      this.object_i = Objects.requireNonNull((T)var1);
   }

   public T getObject_i() {
      return this.object_i;
   }

   @Override
   public Object unwrap() {
      return this.object_i;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (this == var1) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw getThrowable(var3);
      }

      try {
         if (var1 instanceof Util132) {
            return Objects.equals(this.object_i, ((Util132)var1).object_i);
         }
      } catch (IllegalArgumentException var4) {
         throw getThrowable(var4);
      }

      try {
         return var1 instanceof Wrapper ? Objects.equals(this.object_i, ((Wrapper)var1).unwrap()) : false;
      } catch (IllegalArgumentException var2) {
         throw getThrowable(var2);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.object_i);
   }

   @Override
   public String toString() {
      return "[" + this.getClassName() + "]";
   }

   public static void processNullable(Class<? extends Util132<?>> var0) {
      long var1 = 48123868931259L;
      Util34 var3 = getBreezeUtil90_2(var0);

      try {
         if (var3 == null) {
            throw new IllegalArgumentException(
               "Wrapper" + var0.getName() + " must have a public constructor with exactly one parameter."
            );
         }
      } catch (IllegalArgumentException var4) {
         throw getThrowable(var4);
      }

      CONST_J.put(var3.class_a, var3);
      CONST_K.clear();
   }

   public static void update(Class<?> var0) {
      try {
         if (!Util132.class.isAssignableFrom(var0)) {
            return;
         }
      } catch (IllegalArgumentException var2) {
         throw getThrowable(var2);
      }

      Class var1 = var0;
      processNullable(var1);
   }

   public static Util34 getBreezeUtil90(Class<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/Util132.CONST_K Ljava/util/concurrent/ConcurrentHashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast rip/breeze/Util34
      // 0a: astore 1
      // 0b: aload 1
      // 0c: ifnull 15
      // 0f: aload 1
      // 10: areturn
      // 11: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic rip/breeze/Util132.CONST_J Ljava/util/concurrent/ConcurrentHashMap;
      // 18: aload 0
      // 19: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c: checkcast rip/breeze/Util34
      // 1f: astore 2
      // 20: aload 2
      // 21: ifnull 33
      // 24: getstatic rip/breeze/Util132.CONST_K Ljava/util/concurrent/ConcurrentHashMap;
      // 27: aload 0
      // 28: aload 2
      // 29: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: aload 2
      // 2e: areturn
      // 2f: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aconst_null
      // 34: astore 3
      // 35: aconst_null
      // 36: astore 4
      // 38: getstatic rip/breeze/Util132.CONST_J Ljava/util/concurrent/ConcurrentHashMap;
      // 3b: invokevirtual java/util/concurrent/ConcurrentHashMap.entrySet ()Ljava/util/Set;
      // 3e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 43: astore 5
      // 45: aload 5
      // 47: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4c: ifeq 9f
      // 4f: aload 5
      // 51: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 56: checkcast java/util/Map$Entry
      // 59: astore 6
      // 5b: aload 6
      // 5d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 62: checkcast java/lang/Class
      // 65: astore 7
      // 67: aload 7
      // 69: aload 0
      // 6a: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 6d: ifeq 9c
      // 70: aload 4
      // 72: ifnull 8d
      // 75: goto 7c
      // 78: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 4
      // 7e: aload 7
      // 80: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 83: ifeq 9c
      // 86: goto 8d
      // 89: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 6
      // 8f: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 94: checkcast rip/breeze/Util34
      // 97: astore 3
      // 98: aload 7
      // 9a: astore 4
      // 9c: goto 45
      // 9f: aload 3
      // a0: ifnull b3
      // a3: getstatic rip/breeze/Util132.CONST_K Ljava/util/concurrent/ConcurrentHashMap;
      // a6: aload 0
      // a7: aload 3
      // a8: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // ab: pop
      // ac: goto b3
      // af: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b2: athrow
      // b3: aload 3
      // b4: areturn
      // try (5 -> 9): 9 java/lang/IllegalArgumentException
      // try (16 -> 25): 25 java/lang/IllegalArgumentException
      // try (46 -> 52): 53 java/lang/IllegalArgumentException
      // try (50 -> 59): 60 java/lang/IllegalArgumentException
      // try (69 -> 76): 77 java/lang/IllegalArgumentException
   }

   public static Class<? extends Util132<?>> getClass(Class<?> var0) {
      Util34 var1 = getBreezeUtil90(var0);

      try {
         if (var1 != null) {
            return var1.class_b;
         }
      } catch (IllegalArgumentException var2) {
         throw getThrowable(var2);
      }

      return null;
   }

   public static <T, W extends Util132<? super T>> W getDataBuilder11(T param0, Context param1, Scriptable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/Util132.134302887831353L J
      // 03: ldc2_w 41723958932744
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: ifnonnull 12
      // 0c: aconst_null
      // 0d: areturn
      // 0e: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 0
      // 13: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 16: invokestatic rip/breeze/Util132.getBreezeUtil90 (Ljava/lang/Class;)Lrip/breeze/Util34;
      // 19: astore 5
      // 1b: aload 5
      // 1d: ifnonnull 60
      // 20: new java/lang/IllegalStateException
      // 23: dup
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: sipush 18198
      // 2e: ldc2_w 5904310515645402331
      // 31: lload 3
      // 32: lxor
      // 33: invokedynamic s (IJ)Ljava/lang/String; bsm=rip/breeze/Util132.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b: aload 0
      // 3c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3f: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: sipush 14511
      // 48: ldc2_w 547845834468307811
      // 4b: lload 3
      // 4c: lxor
      // 4d: invokedynamic s (IJ)Ljava/lang/String; bsm=rip/breeze/Util132.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 5b: athrow
      // 5c: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 5
      // 62: aload 0
      // 63: invokevirtual rip/breeze/Util34.getDataBuilder11 (Ljava/lang/Object;)Lrip/breeze/Util132;
      // 66: astore 6
      // 68: aload 6
      // 6a: invokevirtual rip/breeze/Util132.getParentScope ()Lorg/mozilla/javascript/Scriptable;
      // 6d: ifnonnull 7d
      // 70: aload 6
      // 72: aload 2
      // 73: invokevirtual rip/breeze/Util132.setParentScope (Lorg/mozilla/javascript/Scriptable;)V
      // 76: goto 7d
      // 79: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 1
      // 7e: aload 2
      // 7f: aload 6
      // 81: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 84: invokestatic rip/breeze/Util132.getScriptable (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Class;)Lorg/mozilla/javascript/Scriptable;
      // 87: astore 7
      // 89: aload 7
      // 8b: ifnull ab
      // 8e: aload 6
      // 90: invokevirtual rip/breeze/Util132.getPrototype ()Lorg/mozilla/javascript/Scriptable;
      // 93: ifnonnull ab
      // 96: goto 9d
      // 99: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: aload 6
      // 9f: aload 7
      // a1: invokevirtual rip/breeze/Util132.setPrototype (Lorg/mozilla/javascript/Scriptable;)V
      // a4: goto ab
      // a7: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: aload 6
      // ad: areturn
      // try (4 -> 8): 8 java/lang/IllegalArgumentException
      // try (14 -> 40): 40 java/lang/IllegalArgumentException
      // try (46 -> 52): 53 java/lang/IllegalArgumentException
      // try (61 -> 66): 67 java/lang/IllegalArgumentException
      // try (63 -> 72): 73 java/lang/IllegalArgumentException
   }

   public static <T, W extends Util132<? super T>> W getDataBuilder11_2(T var0) {
      long var1 = 75269283400289L;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (IllegalArgumentException var6) {
         throw getThrowable(var6);
      }

      Context var3 = Context.getCurrentContext();

      try {
         if (var3 == null) {
            throw new IllegalStateException("ReflectiveWrapper.wrap must be called from a Rhino context");
         }
      } catch (IllegalArgumentException var5) {
         throw getThrowable(var5);
      }

      Scriptable var4 = ScriptRuntime.getTopCallScope(var3);
      return getDataBuilder11(var0, var3, var4);
   }

   private static Util34 getBreezeUtil90_2(Class<? extends Util132<?>> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 1
      // 02: aload 0
      // 03: invokevirtual java/lang/Class.getConstructors ()[Ljava/lang/reflect/Constructor;
      // 06: astore 2
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: bipush 0
      // 0b: istore 4
      // 0d: iload 4
      // 0f: iload 3
      // 10: if_icmpge 50
      // 13: aload 2
      // 14: iload 4
      // 16: aaload
      // 17: astore 5
      // 19: aload 5
      // 1b: invokevirtual java/lang/reflect/Constructor.getParameterCount ()I
      // 1e: bipush 1
      // 1f: if_icmpne 4a
      // 22: aload 1
      // 23: ifnull 47
      // 26: goto 2d
      // 29: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 31: bipush 0
      // 32: aaload
      // 33: aload 5
      // 35: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 38: bipush 0
      // 39: aaload
      // 3a: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 3d: ifeq 4a
      // 40: goto 47
      // 43: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 5
      // 49: astore 1
      // 4a: iinc 4 1
      // 4d: goto 0d
      // 50: aload 1
      // 51: ifnonnull 5a
      // 54: aconst_null
      // 55: areturn
      // 56: invokestatic rip/breeze/Util132.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: invokestatic java/lang/invoke/MethodHandles.publicLookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 5d: aload 1
      // 5e: invokevirtual java/lang/invoke/MethodHandles$Lookup.unreflectConstructor (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
      // 61: astore 2
      // 62: aload 0
      // 63: astore 3
      // 64: new rip/breeze/Util34
      // 67: dup
      // 68: aload 1
      // 69: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 6c: bipush 0
      // 6d: aaload
      // 6e: aload 3
      // 6f: aload 2
      // 70: invokespecial rip/breeze/Util34.<init> (Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/invoke/MethodHandle;)V
      // 73: areturn
      // 74: astore 2
      // 75: new java/lang/RuntimeException
      // 78: dup
      // 79: aload 2
      // 7a: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
      // 7d: athrow
      // try (43 -> 47): 47 java/lang/IllegalAccessException
      // try (21 -> 36): 37 java/lang/IllegalAccessException
      // try (17 -> 23): 24 java/lang/IllegalAccessException
      // try (49 -> 64): 65 java/lang/IllegalAccessException
   }

   private static Scriptable getScriptable(Context var0, Scriptable var1, Class<?> var2) {
      long var3 = 10409103360886L;
      String var5 = buildString(var2);
      Object var6 = ScriptableObject.getProperty(var1, var5);
      if (!(var6 instanceof Scriptable)) {
         try {
            Class var7 = var2;
            Util135.processAll_2(var0, var1, var7);
            var6 = ScriptableObject.getProperty(var1, var5);
         } catch (Throwable var10) {
         }
      }

      if (var6 instanceof Scriptable) {
         Object var11 = ScriptableObject.getProperty((Scriptable)var6, "prototype");
         if (var11 instanceof Scriptable) {
            Scriptable var8 = (Scriptable)var11;

            try {
               if (var8.getParentScope() == null) {
                  ((ScriptableObject)var8).setParentScope(var1);
               }

               return var8;
            } catch (Throwable var9) {
               throw getThrowable(var9);
            }
         }
      }

      return null;
   }

   private static String buildString(Class<?> var0) {
      long var1 = 47788326220293L;
      ScriptObject var3 = var0.getAnnotation(ScriptObject.class);

      try {
         if (var3 == null) {
            throw Context.reportRuntimeError(
               "Class" + var0.getName() + " must be annotated with @ScriptObject(name=..., description=...)."
            );
         }
      } catch (IllegalArgumentException var6) {
         throw getThrowable(var6);
      }

      String var10000;
      label33: {
         try {
            if (var3.name() != null) {
               var10000 = var3.name().trim();
               break label33;
            }
         } catch (IllegalArgumentException var7) {
            throw getThrowable(var7);
         }

         var10000 = "";
      }

      String var4 = var10000;

      try {
         if (var4.isEmpty()) {
            throw Context.reportRuntimeError(
               "@"
                  + ScriptObject.class.getSimpleName()
                  + " on"
                  + var0.getName()
                  + " must provide a non empty name."
            );
         } else {
            return var4;
         }
      } catch (IllegalArgumentException var5) {
         throw getThrowable(var5);
      }
   }

   public static <T extends Util135> void decrypt(Context var0, Scriptable var1, Class<T> var2) {
      Util135.processAll_2(var0, var1, var2);
      update(var2);
   }

   @SafeVarargs
   public static <T extends Util135> void decrypt_1(Context var0, Scriptable var1, Class<? extends T>... var2) {
      for (Class var6 : var2) {
         decrypt(var0, var1, var6);
      }
   }

   static {
      long var0 = 96429665120432L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "\u009d²\u000b/>\"\n4\u0006ÜW\u0085ª]P\u0098\r\u0097 ¥\u0085Ó¿F\u0098r¡§a Ú\"\u008e\u0096&-4\u009ci¸q`{a&ã\u0099\u001f¡\u0081TU²j©\u0006\u0094Àúâ°#î3k\u0091:{»Ò/0NLb¤L¯´L\u009a\u0017sr!v\u008b\u009dðô\u000eÿ§Ñ0ô\u007f\u001b%\u007fÁeÀB f`\td9o@²\u0092\u0001Sëf4dñ¥¥UU\u008bìt\u001a\u0017Ü|\u0088\u009a\u001d¬[p*\u0088Gç¼fÄîë×\u00ad\u007fè`£\u0099\u0081\u00adW\u0097[\u0018\u000b1§Çc8\u0086PòM ÷¥\u001b½ò©B$%ú~úa+\\ÄÑé½$\u001dj\u0081¤¤\u0092ðÜ¢Ù&\u008e\u009f³Ç\\bi\u0092\u0094|\u0017»ÌY¥Ê}\u0084\u001ax*6f\u008d/Ó\u0014R\u0013d5ED\u0010èy>\u009f<»É¾\u0002Zqë{e8\u0088P\u0099ì\tOD\u0002ªó\u0016øaÚ\u0093!cCD\t\u0006´¬NØ\u009fÖ\u009aúq@L\u0090ÿ\n]\u0017\n \u0007Kk§\u008a¾4\u009d\u008f`*\u0095¨¦ ¡E\u0018vª\u0099\rqÆºÑ\u0094÷*bÓ\u0080aÑ\u0019ýÙ\u008c\u0082È«¾0\u0017×ØmÌôeÏ±\u0000\u0080²¿\u0014@¢Ö)ûüV3±¹4¯\u0007*UË.1\u0018Ã[ ØÎò$Ét\u0095\rlç77p\u0090#Û\u0003]fª\bí?ã\u0012MaÏÊÖµ8V#h\u000e\u00836`2Ú¯w\\1\u008e\u008eå\u008f\u001e\\gõtvL\u0081$\u0088SZ, 2F>&E\u008fzFæné%Á¥b0\u0088aÒ2Ö\u001e\u0087ÈÍX~5où®ç;ò\u0004\u001a8\u0017\u009cGÛd×±-±\u008f1ëÀÖB,É\u000bÕ\u0094îÏ¹ó\u008e\u0010\u001eÕ\u000e*\u000b\u007fD2\u00977å:#²Þ»";
      int var7 = "\u009d²\u000b/>\"\n4\u0006ÜW\u0085ª]P\u0098\r\u0097 ¥\u0085Ó¿F\u0098r¡§a Ú\"\u008e\u0096&-4\u009ci¸q`{a&ã\u0099\u001f¡\u0081TU²j©\u0006\u0094Àúâ°#î3k\u0091:{»Ò/0NLb¤L¯´L\u009a\u0017sr!v\u008b\u009dðô\u000eÿ§Ñ0ô\u007f\u001b%\u007fÁeÀB f`\td9o@²\u0092\u0001Sëf4dñ¥¥UU\u008bìt\u001a\u0017Ü|\u0088\u009a\u001d¬[p*\u0088Gç¼fÄîë×\u00ad\u007fè`£\u0099\u0081\u00adW\u0097[\u0018\u000b1§Çc8\u0086PòM ÷¥\u001b½ò©B$%ú~úa+\\ÄÑé½$\u001dj\u0081¤¤\u0092ðÜ¢Ù&\u008e\u009f³Ç\\bi\u0092\u0094|\u0017»ÌY¥Ê}\u0084\u001ax*6f\u008d/Ó\u0014R\u0013d5ED\u0010èy>\u009f<»É¾\u0002Zqë{e8\u0088P\u0099ì\tOD\u0002ªó\u0016øaÚ\u0093!cCD\t\u0006´¬NØ\u009fÖ\u009aúq@L\u0090ÿ\n]\u0017\n \u0007Kk§\u008a¾4\u009d\u008f`*\u0095¨¦ ¡E\u0018vª\u0099\rqÆºÑ\u0094÷*bÓ\u0080aÑ\u0019ýÙ\u008c\u0082È«¾0\u0017×ØmÌôeÏ±\u0000\u0080²¿\u0014@¢Ö)ûüV3±¹4¯\u0007*UË.1\u0018Ã[ ØÎò$Ét\u0095\rlç77p\u0090#Û\u0003]fª\bí?ã\u0012MaÏÊÖµ8V#h\u000e\u00836`2Ú¯w\\1\u008e\u008eå\u008f\u001e\\gõtvL\u0081$\u0088SZ, 2F>&E\u008fzFæné%Á¥b0\u0088aÒ2Ö\u001e\u0087ÈÍX~5où®ç;ò\u0004\u001a8\u0017\u009cGÛd×±-±\u008f1ëÀÖB,É\u000bÕ\u0094îÏ¹ó\u008e\u0010\u001eÕ\u000e*\u000b\u007fD2\u00977å:#²Þ»"
         .length();
      char var8 = 'h';
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
                     CONST_V = var4;
                     CONST_W = new String[10];
                     CONST_J = new ConcurrentHashMap<>();
                     CONST_K = new ConcurrentHashMap<>();
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

                  var6 = "ð\f82\u0087y\u0094\"3ÁÚ\u0082\u0093µF#ï\u008dï[RËØ\u0019\u009d3!}\u00ad\u009dÉ¹Û\u000f²@R\u0083\u001c¦Ê\u009a\u0017\u001e@Ò\rÊj`\u0005\\wÃc¥\u009añ^&Ù=8\u0007¢g\u0094ê#~±Ù¼ý±MjK,o?\u0018ñíò\u009fás3Ø°P\u000e\u0098¬õG8ùÿ\u0001ÿA\u0003\u0010g\u0099ÏjÛ(Û]\u001f\u0094Ö\u0086´\u0093¦»";
                  var7 = "ð\f82\u0087y\u0094\"3ÁÚ\u0082\u0093µF#ï\u008dï[RËØ\u0019\u009d3!}\u00ad\u009dÉ¹Û\u000f²@R\u0083\u001c¦Ê\u009a\u0017\u001e@Ò\rÊj`\u0005\\wÃc¥\u009añ^&Ù=8\u0007¢g\u0094ê#~±Ù¼ý±MjK,o?\u0018ñíò\u009fás3Ø°P\u000e\u0098¬õG8ùÿ\u0001ÿA\u0003\u0010g\u0099ÏjÛ(Û]\u001f\u0094Ö\u0086´\u0093¦»"
                     .length();
                  var8 = 'h';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23039;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/a4", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/a4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
