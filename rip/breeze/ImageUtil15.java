package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.client.UserTheme;

@ScriptNamespace(name = "script", description = "Can be used to register event listeners and settings.")
public abstract class ImageUtil15 extends HttpUtil4 {
   private final Map<Class<? extends CancellableEvent>, Util2> map_g;
   private final List<Runnable> list_h;
   private final List<Consumer<UserTheme>> list_i;
   private final List<Consumer<UserTheme>> list_j;
   public final DateUtil dataBuilder51_k;
   private final GenericSetting<Boolean> dataBuilder54_l;
   private String string_m;
   private String string_n;
   protected String string_o;
   private boolean fieldBool_p;
   private boolean fieldBool_q;
   private GenericSetting<KeyBind> dataBuilder54_r;
   private GenericSetting<Boolean> dataBuilder54_s;
   private boolean fieldBool_t;
   private Function function_u;
   private Function function_v;
   private Function function_w;
   public Context context_x;
   public Scriptable scriptable_y;
   public final ArrayList<ImageUtil11> arrayList_z;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);

   public ImageUtil15(String var1, String var2, String var3) {
      long var4 = 139451652957450L;
      super();
      this.map_g = new HashMap<>();
      this.list_h = new ArrayList<>();
      this.list_i = new ArrayList<>();
      this.list_j = new ArrayList<>();
      this.dataBuilder51_k = new Util38(this);
      this.dataBuilder54_l = GenericSetting.<Boolean>getDataBuilder50(this.dataBuilder51_k, "Enabled")
         .getDataBuilder50_9(ImageUtil15::lambda$new_Inner0)
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.fieldBool_p = true;
      this.fieldBool_q = false;
      this.dataBuilder54_r = null;
      this.dataBuilder54_s = null;
      this.fieldBool_t = false;
      this.arrayList_z = new ArrayList<>();
      this.string_m = var1;
      this.string_o = var2;
      this.string_n = var3;
      this.dataBuilder54_r = GenericSetting.<KeyBind>getDataBuilder50(this.dataBuilder51_k, "Bind")
         .getDataBuilder50_3("The keybind for this script.")
         .getDataBuilder50_4(new KeyBind())
         .getDataBuilder54();
   }

   public ImageUtil15(String var1, String var2) {
      this(var1, var2, "");
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "Script";
   }

   protected void processAll() {
      long var1 = 76249225428122L;
      this.context_x = Context.enter();
      this.context_x.setOptimizationLevel(9);
      this.context_x.setLanguageVersion(200);
      this.scriptable_y = this.context_x.initSafeStandardObjects();
      HttpUtil4.initialize(this.context_x, this.scriptable_y);
      BreezeContext.settingBuilder_i.onEnable(this.context_x, this.scriptable_y);
      BreezeContext.settingBuilder_i.onEvent(this.context_x, this.scriptable_y, this);
      this.d();
      ScriptableObject.putProperty(this.scriptable_y, "script", this);
      this.fieldBool_t = true;

      try {
         this.context_x.evaluateString(this.scriptable_y, this.string_o, this.string_m, 1, null);
      } catch (RhinoException var9) {
         this.processAll_9(var9);
      } finally {
         this.fieldBool_t = false;
      }

      UserTheme var3 = this.getTheme();

      try {
         ImageUtil16.processNullable(this.dataBuilder51_k, var3);
         this.list_j.forEach(ImageUtil15::lambda$load_Inner1);
         if (this.isValid()) {
            EventBus.processAll_2(this, this.map_g);
         }
      } catch (RhinoException var8) {
         throw getRuntimeException(var8);
      }
   }

   protected void update() {
      this.update_2();
      this.update_1();
      this.dataBuilder54_l.processAll(false);
      this.dataBuilder51_k.processAll(this.dataBuilder54_l);
      this.processAll();
   }

   public void update_1() {
      EventBus.processAll_3(this);
      this.dataBuilder51_k.initialize();
      this.arrayList_z.clear();
      this.map_g.clear();
      this.list_h.forEach(Runnable::run);
      this.list_h.clear();
      this.list_i.clear();
      this.list_j.clear();
      this.function_u = this.function_v = this.function_w = null;
      this.fieldBool_p = false;
      this.fieldBool_q = false;
      this.dataBuilder54_r = null;
      this.dataBuilder54_s = null;
   }

   protected void update_2() {
      UserTheme var1 = ImageUtil16.getUserTheme(this.dataBuilder51_k);
      this.list_i.forEach(ImageUtil15::lambda$save_Inner2);
      this.setTheme(var1);
   }

   public void initialize(Runnable var1) {
      this.list_h.add(var1);
   }

   public void update_3(Consumer<UserTheme> var1, Consumer<UserTheme> var2) {
      this.list_j.add(var1);
      this.list_i.add(var2);
   }

   public void update_4() {
      try {
         if (this.isValid()) {
            this.processAll_3();
            return;
         }
      } catch (RhinoException var1) {
         throw getRuntimeException(var1);
      }

      this.processAll_2();
   }

   public void processAll_2() {
      try {
         if (this.isValid()) {
            return;
         }
      } catch (RhinoException var2) {
         throw getRuntimeException(var2);
      }

      RhinoException var1;
      try {
         EventBus.processAll_2(this, this.map_g);
         this.dataBuilder54_l.processAll(true);
         if (this.function_u == null) {
            return;
         }

         try {
            this.function_u.call(this.context_x, this.scriptable_y, null, ScriptRuntime.emptyArgs);
            return;
         } catch (RhinoException var3) {
            var1 = var3;
         }
      } catch (IllegalStateException var4) {
         throw getRuntimeException(var4);
      }

      this.processAll_9(var1);
   }

   public String getString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/ImageUtil15.26842511494418L J
      // 03: ldc2_w 109838982124258
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: getfield rip/breeze/ImageUtil15.function_w Lorg/mozilla/javascript/Function;
      // 0c: ifnull 54
      // 0f: aload 0
      // 10: getfield rip/breeze/ImageUtil15.function_w Lorg/mozilla/javascript/Function;
      // 13: aload 0
      // 14: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 17: aload 0
      // 18: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 1b: aconst_null
      // 1c: getstatic org/mozilla/javascript/ScriptRuntime.emptyArgs [Ljava/lang/Object;
      // 1f: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 24: astore 3
      // 25: aload 3
      // 26: ifnonnull 2b
      // 29: aconst_null
      // 2a: areturn
      // 2b: aload 3
      // 2c: instanceof java/lang/String
      // 2f: ifeq 3b
      // 32: aload 3
      // 33: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 36: areturn
      // 37: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a: athrow
      // 3b: sipush 21327
      // 3e: ldc2_w 2613954050123684783
      // 41: lload 1
      // 42: lxor
      // 43: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/ImageUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokestatic org/mozilla/javascript/Context.reportError (Ljava/lang/String;)V
      // 4b: goto 54
      // 4e: astore 3
      // 4f: aload 0
      // 50: aload 3
      // 51: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 54: aconst_null
      // 55: areturn
      // try (7 -> 20): 36 org/mozilla/javascript/RhinoException
      // try (21 -> 26): 36 org/mozilla/javascript/RhinoException
      // try (21 -> 27): 27 java/lang/IllegalStateException
      // try (29 -> 35): 36 org/mozilla/javascript/RhinoException
   }

   @JSFunction(value = "disable", description = "Disable the script.")
   public void processAll_3() {
      try {
         if (!this.isValid()) {
            return;
         }
      } catch (RhinoException var2) {
         throw getRuntimeException(var2);
      }

      RhinoException var1;
      try {
         EventBus.processAll_3(this);
         this.dataBuilder54_l.processAll(false);
         if (this.function_v == null) {
            return;
         }

         try {
            this.function_v.call(this.context_x, this.scriptable_y, null, ScriptRuntime.emptyArgs);
            return;
         } catch (RhinoException var3) {
            var1 = var3;
         }
      } catch (IllegalStateException var4) {
         throw getRuntimeException(var4);
      }

      this.processAll_9(var1);
   }

   @JSFunction(value = "enabled", returns = "If the module is enabled or not.")
   public boolean isValid() {
      return this.dataBuilder54_l.getObject_m();
   }

   @JSFunction(value = "getName", returns = "The name of the script.")
   public String getString_m() {
      return this.string_m;
   }

   @JSGetter(value = "description", description = "The description of the script.")
   public String getString_n() {
      return this.string_n;
   }

   @JSSetter("description")
   public void setString_n(String var1) {
      this.string_n = var1;
   }

   @JSGetter(value = "allowBind", description = "Whether this script allows a keybind.")
   public boolean isBool_p() {
      return this.fieldBool_p;
   }

   @JSSetter("allowBind")
   public void processAll_4(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/ImageUtil15.26842511494418L J
      // 03: ldc2_w 15400505794547
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield rip/breeze/ImageUtil15.fieldBool_p Z
      // 0c: iload 1
      // 0d: if_icmpne 15
      // 10: return
      // 11: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: putfield rip/breeze/ImageUtil15.fieldBool_p Z
      // 1a: iload 1
      // 1b: ifeq 68
      // 1e: aload 0
      // 1f: getfield rip/breeze/ImageUtil15.dataBuilder54_r Lrip/breeze/GenericSetting;
      // 22: ifnonnull 68
      // 25: goto 2c
      // 28: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 0
      // 2e: getfield rip/breeze/ImageUtil15.dataBuilder51_k Lrip/breeze/DateUtil;
      // 31: sipush 24558
      // 34: ldc2_w 1711797585399224859
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/ImageUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: invokestatic rip/breeze/GenericSetting.getDataBuilder50 (Lrip/breeze/DateUtil;Ljava/lang/String;)Lrip/breeze/BlockUtil10;
      // 41: sipush 6116
      // 44: ldc2_w 4429580090539233816
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/ImageUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: invokevirtual rip/breeze/BlockUtil10.getDataBuilder50_3 (Ljava/lang/String;)Lrip/breeze/BlockUtil10;
      // 51: new rip/breeze/KeyBind
      // 54: dup
      // 55: invokespecial rip/breeze/KeyBind.<init> ()V
      // 58: invokevirtual rip/breeze/BlockUtil10.getDataBuilder50_4 (Ljava/lang/Object;)Lrip/breeze/BlockUtil10;
      // 5b: invokevirtual rip/breeze/BlockUtil10.getDataBuilder54 ()Lrip/breeze/GenericSetting;
      // 5e: putfield rip/breeze/ImageUtil15.dataBuilder54_r Lrip/breeze/GenericSetting;
      // 61: goto 68
      // 64: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: return
      // try (4 -> 9): 9 org/mozilla/javascript/RhinoException
      // try (11 -> 19): 20 org/mozilla/javascript/RhinoException
      // try (16 -> 43): 44 org/mozilla/javascript/RhinoException
   }

   @JSGetter(value = "allowHold", description = "Whether this script allows hold mode.")
   public boolean isBool_q() {
      return this.fieldBool_q;
   }

   @JSSetter("allowHold")
   public void processAll_5(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/ImageUtil15.26842511494418L J
      // 03: ldc2_w 48950945478082
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield rip/breeze/ImageUtil15.fieldBool_q Z
      // 0c: iload 1
      // 0d: if_icmpne 15
      // 10: return
      // 11: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: putfield rip/breeze/ImageUtil15.fieldBool_q Z
      // 1a: iload 1
      // 1b: ifeq 65
      // 1e: aload 0
      // 1f: getfield rip/breeze/ImageUtil15.dataBuilder54_s Lrip/breeze/GenericSetting;
      // 22: ifnonnull 65
      // 25: goto 2c
      // 28: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 0
      // 2e: getfield rip/breeze/ImageUtil15.dataBuilder51_k Lrip/breeze/DateUtil;
      // 31: sipush 10297
      // 34: ldc2_w 2378399751438190586
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/ImageUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: invokestatic rip/breeze/GenericSetting.getDataBuilder50 (Lrip/breeze/DateUtil;Ljava/lang/String;)Lrip/breeze/BlockUtil10;
      // 41: sipush 21281
      // 44: ldc2_w 8493520361789111528
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/ImageUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: invokevirtual rip/breeze/BlockUtil10.getDataBuilder50_3 (Ljava/lang/String;)Lrip/breeze/BlockUtil10;
      // 51: bipush 0
      // 52: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 55: invokevirtual rip/breeze/BlockUtil10.getDataBuilder50_4 (Ljava/lang/Object;)Lrip/breeze/BlockUtil10;
      // 58: invokevirtual rip/breeze/BlockUtil10.getDataBuilder54 ()Lrip/breeze/GenericSetting;
      // 5b: putfield rip/breeze/ImageUtil15.dataBuilder54_s Lrip/breeze/GenericSetting;
      // 5e: goto 65
      // 61: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 64: athrow
      // 65: return
      // try (4 -> 9): 9 org/mozilla/javascript/RhinoException
      // try (11 -> 19): 20 org/mozilla/javascript/RhinoException
      // try (16 -> 42): 43 org/mozilla/javascript/RhinoException
   }

   public KeyBind getKeyBind() {
      try {
         if (this.dataBuilder54_r != null) {
            return this.dataBuilder54_r.getObject_m();
         }
      } catch (RhinoException var1) {
         throw getRuntimeException(var1);
      }

      return KeyBind.CONST_G;
   }

   public boolean checkCondition() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/ImageUtil15.dataBuilder54_s Lrip/breeze/GenericSetting;
      // 04: ifnull 26
      // 07: aload 0
      // 08: getfield rip/breeze/ImageUtil15.dataBuilder54_s Lrip/breeze/GenericSetting;
      // 0b: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: ifeq 26
      // 17: goto 1e
      // 1a: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: goto 27
      // 22: invokestatic rip/breeze/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
      // try (0 -> 9): 10 org/mozilla/javascript/RhinoException
      // try (3 -> 14): 14 org/mozilla/javascript/RhinoException
   }

   @JSFunction(value = "log", description = "Log a message to the script console.", params = "The message to log.")
   public void processAll_6(String var1) {
      try {
         this.arrayList_z.add(new ImageUtil11(var1));
         if (this.arrayList_z.size() > 150) {
            this.arrayList_z.remove(0);
         }
      } catch (RhinoException var2) {
         throw getRuntimeException(var2);
      }
   }

   @JSFunction(
      value = "log",
      description = "Log a message to the script console. With a given color.",
      params = {"The message to log.", "The color you want the log to appear in."}
   )
   public void processAll_7(String var1, RenderUtil4_x var2) {
      try {
         this.arrayList_z.add(new ImageUtil11(var1, (Color)var2.b()));
         if (this.arrayList_z.size() > 150) {
            this.arrayList_z.remove(0);
         }
      } catch (RhinoException var3) {
         throw getRuntimeException(var3);
      }
   }

   public void processAll_8(String var1, Color var2) {
      try {
         this.arrayList_z.add(new ImageUtil11(var1, var2));
         if (this.arrayList_z.size() > 150) {
            this.arrayList_z.remove(0);
         }
      } catch (RhinoException var3) {
         throw getRuntimeException(var3);
      }
   }

   public void processAll_9(Exception var1) {
      try {
         this.arrayList_z.add(new ImageUtil11(var1));
         if (this.arrayList_z.size() > 150) {
            this.arrayList_z.remove(0);
         }
      } catch (RhinoException var2) {
         throw getRuntimeException(var2);
      }
   }

   @JSFunction(
      value = "onEnable",
      description = "Register a callback to run when the script is enabled.",
      params = "The function to run.",
      remarks = "This can only be used while the script is initializing."
   )
   public void processAll(Function var1) {
      long var2 = 131890071738987L;

      try {
         if (!this.fieldBool_t) {
            throw new IllegalStateException("You can only register events while the script is initializing!");
         }
      } catch (RhinoException var4) {
         throw getRuntimeException(var4);
      }

      this.function_u = var1;
   }

   @JSFunction(
      value = "onDisable",
      description = "Register a callback to run when the script is disabled.",
      params = "The function to run.",
      remarks = "This can only be used while the script is initializing."
   )
   public void processAll_1(Function var1) {
      long var2 = 14215892307134L;

      try {
         if (!this.fieldBool_t) {
            throw new IllegalStateException("You can only register events while the script is initializing!");
         }
      } catch (RhinoException var4) {
         throw getRuntimeException(var4);
      }

      this.function_v = var1;
   }

   @JSFunction(
      value = "metadata",
      description = "Register a callback to provide script metadata, this metadata can be displayed in the arraylist.",
      params = "The function to run for retrieving metadata.",
      remarks = "This can only be used while the script is initializing."
   )
   public void processAll_2(Function var1) {
      long var2 = 137769682973671L;

      try {
         if (!this.fieldBool_t) {
            throw new IllegalStateException("You can only register metadata callbacks while the script is initializing!");
         }
      } catch (RhinoException var4) {
         throw getRuntimeException(var4);
      }

      this.function_w = var1;
   }

   @JSFunction(
      value = "addListener",
      description = "Add an event listener to the script.",
      params = {"The event to listen to.", "The function to call when the event is fired."},
      remarks = "This can only be used while the script is initializing.",
      example = "script.addListener(\"Render3DEvent\", (event) => {\n  // ...\n});"
   )
   public void processNullable(String var1, Function var2) {
      long var3 = 44609551820757L;

      try {
         if (!this.fieldBool_t) {
            throw new IllegalStateException("You can only register events while the script is initializing!");
         }
      } catch (RhinoException var7) {
         throw getRuntimeException(var7);
      }

      Class var5 = BreezeContext.settingBuilder_i.getEventClass(var1);

      try {
         if (var5 == null) {
            throw new IllegalArgumentException(
               "Event" + var1 + " does not exist!"
            );
         }
      } catch (RhinoException var6) {
         throw getRuntimeException(var6);
      }

      this.map_g.put(var5, new Util2(this, var2));
   }

   public abstract UserTheme getTheme();

   public abstract void setTheme(UserTheme var1);

   private static void lambda$save_Inner2(UserTheme var0, Consumer var1) {
      var1.accept(var0);
   }

   private static void lambda$load_Inner1(UserTheme var0, Consumer var1) {
      var1.accept(var0);
   }

   private static boolean lambda$new_Inner0(DateUtil var0) {
      return false;
   }

   static String getString_m(ImageUtil15 var0) {
      return var0.string_m;
   }

   static {
      long var0 = 63871397395352L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "oÍBq\u0004\u0001øÂÔÎ\u001fõ\u0094Ù<iìÃ@¡°ñZC!dýô¯\u0013Q×\u0080A_\u008bºªÒY=d\u0014Ix£<ßZ%Ez0yµW\u001dPKJ3Ø¾\u008dÿá¸\u0082\u001f\u0090Ý« zØ\u0002\u0081(y´\u009b*\u008eÔÌO\u0007Õß$ØMF)Ã?[À\u0080Ã\u0003YtÔ\u0010ÙÖ\u0091ðö=kRVÂ÷êÚéI\u0002(\u008eo1þ\u009aç[\u0017\u0012Fcdu<±}ð¦F\u001b3äû\u009bvy°o\u00adËÛ\u0016\u0092Ï¥\r°\u001e.T\u0010À\u001d\u009fØÐ#ÏÕøõ£Ï\u0097ñaj\u0010¶õèÑw±f¡\u0085èÚ\u009c\u0017N\u0002\u009c\u0010ïü9Ó\u0099t·\u001f¼\u0090 üX.\u0013ºpú¬b\u0099âÏ\u009aú\u001683Î\u009eð¸Ú\u00032îï\u009aÓÝbR\u0014/à°ì~ê\u0004÷¾\"\u008c\u0086\u000b-\u0098\u0004g\u0003÷_\u0088\u0093iA\u00adxPÅkx\u0089Äc\u0095à\u009eÁ\u00ad=½æ\u000f\f\u0001!@Âú2MõémAo9w\u0093òö\u0007Ó«=1\u0019\u009eÂ3·w@\nî\u008b\u008b\u009bÂ}\u0011Í?1gg¯\u0010\b.eºø\u001fL·8æ\u0088Ë\u008c0çÜ\u0080yËÚ\u0083×ÓÙ\u001d\u0013\u009d.Æð½Ý\u0092L;\u001d\u009eá\u008b\u0017p >æcå\u0011G9Î_ÂÎ@\u0010,\u009fx\u0087¥õ\u001d´\u000e~9¨:Zò,\u0015\u00ad°[vÅ¤g!Gà\u0085ãö\u008cÄ\u0088\u0084\u0014·\u009e\u007f¬vÔ#\u0080pI\u00178\r\u0015¯'&Â#Ã\u0096@\u0087\u0007å\u0082\u008bÊS\u0005I#\u0002E\u0016ù+rïî\u0094\u0099?ÿ\u0099®j_Ê\u0089\u008fòÞè\u009c0\u001dã\u0085I\u0092¹IVpB(\tÓïm-Ï\u0084\u0002½ÙÇ[£ÂØì\u0019\u0089©\u0010\u0001ì\fÍ\u001a\fÓe2áÆ*>mön§0\"£\u0088\u0013Ðäè\u008bÂï\u0014\t\u0084ùø\u0017\\äwÓ÷\u0084\u0001\u00802¹»eeñ-ßRtÍ7áÙ@S\u0086bkù´iiÝ`1n>7Wåk&+7\u009bm\u0017 \u000fáe\fWÛ\u0088ØåO7\u0089ª*±k?G_&_\u007f\u0003k\u008fúãÄ<¨jÌÄÇßM7zí\u0098|ÒC°¯Ùæ#:b\u0097:'¶\u0088w\u0085R´Ú` _\u0013\u0003\u008bV+Ö©L±Ô#e Èº¬\u0086(]\u0010Æ\u0012»K!)%é°\u0000¦ûqÃ\u0004%";
      int var7 = "oÍBq\u0004\u0001øÂÔÎ\u001fõ\u0094Ù<iìÃ@¡°ñZC!dýô¯\u0013Q×\u0080A_\u008bºªÒY=d\u0014Ix£<ßZ%Ez0yµW\u001dPKJ3Ø¾\u008dÿá¸\u0082\u001f\u0090Ý« zØ\u0002\u0081(y´\u009b*\u008eÔÌO\u0007Õß$ØMF)Ã?[À\u0080Ã\u0003YtÔ\u0010ÙÖ\u0091ðö=kRVÂ÷êÚéI\u0002(\u008eo1þ\u009aç[\u0017\u0012Fcdu<±}ð¦F\u001b3äû\u009bvy°o\u00adËÛ\u0016\u0092Ï¥\r°\u001e.T\u0010À\u001d\u009fØÐ#ÏÕøõ£Ï\u0097ñaj\u0010¶õèÑw±f¡\u0085èÚ\u009c\u0017N\u0002\u009c\u0010ïü9Ó\u0099t·\u001f¼\u0090 üX.\u0013ºpú¬b\u0099âÏ\u009aú\u001683Î\u009eð¸Ú\u00032îï\u009aÓÝbR\u0014/à°ì~ê\u0004÷¾\"\u008c\u0086\u000b-\u0098\u0004g\u0003÷_\u0088\u0093iA\u00adxPÅkx\u0089Äc\u0095à\u009eÁ\u00ad=½æ\u000f\f\u0001!@Âú2MõémAo9w\u0093òö\u0007Ó«=1\u0019\u009eÂ3·w@\nî\u008b\u008b\u009bÂ}\u0011Í?1gg¯\u0010\b.eºø\u001fL·8æ\u0088Ë\u008c0çÜ\u0080yËÚ\u0083×ÓÙ\u001d\u0013\u009d.Æð½Ý\u0092L;\u001d\u009eá\u008b\u0017p >æcå\u0011G9Î_ÂÎ@\u0010,\u009fx\u0087¥õ\u001d´\u000e~9¨:Zò,\u0015\u00ad°[vÅ¤g!Gà\u0085ãö\u008cÄ\u0088\u0084\u0014·\u009e\u007f¬vÔ#\u0080pI\u00178\r\u0015¯'&Â#Ã\u0096@\u0087\u0007å\u0082\u008bÊS\u0005I#\u0002E\u0016ù+rïî\u0094\u0099?ÿ\u0099®j_Ê\u0089\u008fòÞè\u009c0\u001dã\u0085I\u0092¹IVpB(\tÓïm-Ï\u0084\u0002½ÙÇ[£ÂØì\u0019\u0089©\u0010\u0001ì\fÍ\u001a\fÓe2áÆ*>mön§0\"£\u0088\u0013Ðäè\u008bÂï\u0014\t\u0084ùø\u0017\\äwÓ÷\u0084\u0001\u00802¹»eeñ-ßRtÍ7áÙ@S\u0086bkù´iiÝ`1n>7Wåk&+7\u009bm\u0017 \u000fáe\fWÛ\u0088ØåO7\u0089ª*±k?G_&_\u007f\u0003k\u008fúãÄ<¨jÌÄÇßM7zí\u0098|ÒC°¯Ùæ#:b\u0097:'¶\u0088w\u0085R´Ú` _\u0013\u0003\u008bV+Ö©L±Ô#e Èº¬\u0086(]\u0010Æ\u0012»K!)%é°\u0000¦ûqÃ\u0004%"
         .length();
      char var8 = 'h';
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
                     CONST_J = var4;
                     CONST_K = new String[15];
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

                  var6 = "ÏH~õõÁ×c\u009d\u0096C\u000buù¡Ù\u0093®ÉÀ\u0083gO<¬Ó\u000bTÊ$T\u001búò\u0087\u0091.\u0014md2g.C56\u009b@\u0010\"ñh\n\u0081Ò\u008dË¾¸7µhjkA";
                  var7 = "ÏH~õõÁ×c\u009d\u0096C\u000buù¡Ù\u0093®ÉÀ\u0083gO<¬Ó\u000bTÊ$T\u001búò\u0087\u0091.\u0014md2g.C56\u009b@\u0010\"ñh\n\u0081Ò\u008dË¾¸7µhjkA"
                     .length();
                  var8 = '0';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException getRuntimeException(RuntimeException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22288;
      if (CONST_K[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_L.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_L.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aN", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_J[var3].getBytes("ISO-8859-1");
         CONST_K[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_K[var3];
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
         throw new RuntimeException("rip/breeze/aN" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
