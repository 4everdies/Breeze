package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.ModuleManager;
import rip.breeze.client.UserTheme;

@ScriptNamespace(name = "hudManager", description = "Used for registering hud scripts.")
public class MathUtil5 implements IBreezeInterface2 {
   private final ImageUtil15 dataBuilder17_a;
   private final ModuleManager moduleManager_b;
   private final RotationUtil8 dataBuilder14_c;
   private boolean fieldBool_d = false;
   private Function function_e;
   private Function function_f;
   private Function function_g;
   private Function function_h;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);

   public MathUtil5(ImageUtil15 var1, ModuleManager var2) {
      this.dataBuilder17_a = var1;
      this.moduleManager_b = var2;
      this.dataBuilder14_c = new RotationUtil8(this, AimYawMode.CENTER, AimYawMode2.CENTER, 0.0, 0.0);
      var1.initialize(this::initialize);
      var1.update_3(this::update_1, this::update_2);
   }

   private void processAll() {
      if (!this.fieldBool_d) {
         this.fieldBool_d = true;
         this.moduleManager_b.initialize(this);
      }
   }

   @JSFunction(
      value = "onRender",
      description = "Register a callback that runs on render.",
      params = "Function that will render this HUD element. Receives (x, y, scale) as arguments.",
      example = "hudManager.onRender((x, y, scale) => {\n //draw something here \n });"
   )
   public void processAll_1(Function var1) {
      long var2 = 79198890514880L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_a) {
         Context.reportError("Cannot bind onRender outside of the script initialization phase.");
      }

      this.processAll();
      this.function_e = var1;
   }

   @JSFunction(
      value = "onBackground",
      description = "Register a callback that runs when background rects are collected.",
      params = "Function that will provide background for this HUD element.",
      example = "hudManager.onBackground(() => {\n    return [new ScriptRoundedRect(hudManager.x, hudManager.y, 100, 20, 3 * hudManager.scale)];\n });"
   )
   public void update(Function var1) {
      long var2 = 2367679062384L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_a) {
         Context.reportError("Cannot bind onBackground outside of the script initialization phase.");
      }

      this.processAll();
      this.function_f = var1;
   }

   @JSFunction(
      value = "onWidth",
      description = "Register a callback that returns the width of this HUD element.",
      params = "Function returning the width in pixels.",
      example = "hudManager.onWidth(() => { return 100; });"
   )
   public void processAll_2(Function var1) {
      long var2 = 52697774409898L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_a) {
         Context.reportError("Cannot bind onWidth outside of the script initialization phase.");
      }

      this.function_g = var1;
   }

   @JSFunction(
      value = "onHeight",
      description = "Register a callback that returns the height of this HUD element.",
      params = "Function returning the height in pixels.",
      example = "hudManager.onHeight(() => { return 20; });"
   )
   public void processAll_3(Function var1) {
      long var2 = 133534521950170L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_a) {
         Context.reportError("Cannot bind onHeight outside of the script initialization phase.");
      }

      this.function_h = var1;
   }

   @JSFunction(value = "scale", description = "Gives the scale for the hud, things like padding, corner radii, and elements size should be based on this.")
   public float getFloat() {
      return this.moduleManager_b.fieldInt_l;
   }

   @JSFunction(value = "fontHeight", description = "Gives the fontHeight of the font that the user has selected.")
   public float getFloat_2() {
      return this.moduleManager_b.fieldInt_k;
   }

   @JSFunction(value = "x", description = "The current x position of this HUD element on screen.")
   public int getValue() {
      return this.getDataBuilder14().clamp_2();
   }

   @JSFunction(value = "y", description = "The current y position of this HUD element on screen.")
   public int getValue_2() {
      return this.getDataBuilder14().clamp_3();
   }

   private void initialize() {
      if (this.fieldBool_d) {
         this.moduleManager_b.initialize_2(this);
      }
   }

   private void update_1(UserTheme var1) {
      long var2 = 70560844638968L;
      if (this.fieldBool_d && var1.isValid("hud_position")) {
         this.dataBuilder14_c.update(var1.getDataBuilder2_2("hud_position"));
      }
   }

   private void update_2(UserTheme var1) {
      long var2 = 120469089014542L;
      long var4 = var2 ^ 8313844558641L;
      if (this.fieldBool_d) {
         var1.processNullable("hud_position", var4, this.dataBuilder14_c.getDataBuilder2());
      }
   }

   public int getValue_3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/MathUtil5.function_g Lorg/mozilla/javascript/Function;
      // 04: ifnull 18
      // 07: aload 0
      // 08: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 0b: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 0e: ifne 1f
      // 11: goto 18
      // 14: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: bipush 20
      // 1a: ireturn
      // 1b: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield rip/breeze/MathUtil5.function_g Lorg/mozilla/javascript/Function;
      // 23: aload 0
      // 24: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 27: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 2a: aload 0
      // 2b: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 2e: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 31: aconst_null
      // 32: bipush 0
      // 33: anewarray 4
      // 36: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 3b: astore 1
      // 3c: aload 1
      // 3d: invokestatic org/mozilla/javascript/Context.toNumber (Ljava/lang/Object;)D
      // 40: d2i
      // 41: ireturn
      // 42: astore 1
      // 43: aload 0
      // 44: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 47: aload 1
      // 48: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 4b: bipush 20
      // 4d: ireturn
      // try (3 -> 12): 12 java/lang/Exception
      // try (0 -> 7): 8 java/lang/Exception
      // try (14 -> 30): 31 java/lang/Exception
   }

   public int getValue_4() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/MathUtil5.function_h Lorg/mozilla/javascript/Function;
      // 04: ifnull 18
      // 07: aload 0
      // 08: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 0b: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 0e: ifne 1f
      // 11: goto 18
      // 14: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: bipush 20
      // 1a: ireturn
      // 1b: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield rip/breeze/MathUtil5.function_h Lorg/mozilla/javascript/Function;
      // 23: aload 0
      // 24: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 27: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 2a: aload 0
      // 2b: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 2e: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 31: aconst_null
      // 32: bipush 0
      // 33: anewarray 4
      // 36: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 3b: astore 1
      // 3c: aload 1
      // 3d: invokestatic org/mozilla/javascript/Context.toNumber (Ljava/lang/Object;)D
      // 40: d2i
      // 41: ireturn
      // 42: astore 1
      // 43: aload 0
      // 44: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 47: aload 1
      // 48: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 4b: bipush 20
      // 4d: ireturn
      // try (3 -> 12): 12 java/lang/Exception
      // try (0 -> 7): 8 java/lang/Exception
      // try (14 -> 30): 31 java/lang/Exception
   }

   public void calculate(List<Util8> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/MathUtil5.function_f Lorg/mozilla/javascript/Function;
      // 04: ifnull 18
      // 07: aload 0
      // 08: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 0b: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 0e: ifne 1d
      // 11: goto 18
      // 14: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: return
      // 19: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield rip/breeze/MathUtil5.function_f Lorg/mozilla/javascript/Function;
      // 21: aload 0
      // 22: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 25: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 28: aload 0
      // 29: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 2c: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 2f: aconst_null
      // 30: bipush 0
      // 31: anewarray 4
      // 34: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 39: astore 2
      // 3a: aload 2
      // 3b: instanceof org/mozilla/javascript/NativeArray
      // 3e: ifne 42
      // 41: return
      // 42: aload 2
      // 43: checkcast org/mozilla/javascript/NativeArray
      // 46: astore 3
      // 47: lconst_0
      // 48: lstore 4
      // 4a: lload 4
      // 4c: aload 3
      // 4d: invokevirtual org/mozilla/javascript/NativeArray.getLength ()J
      // 50: lcmp
      // 51: ifge b2
      // 54: aload 3
      // 55: lload 4
      // 57: l2i
      // 58: aload 3
      // 59: invokevirtual org/mozilla/javascript/NativeArray.get (ILorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;
      // 5c: astore 6
      // 5e: aload 6
      // 60: instanceof rip/breeze/RoundedRect
      // 63: ifeq a9
      // 66: aload 6
      // 68: checkcast rip/breeze/RoundedRect
      // 6b: invokevirtual rip/breeze/RoundedRect.b ()Ljava/lang/Object;
      // 6e: checkcast rip/breeze/Util8
      // 71: astore 7
      // 73: aload 1
      // 74: new rip/breeze/Util8
      // 77: dup
      // 78: aload 7
      // 7a: getfield rip/breeze/Util8.fieldFloat_a F
      // 7d: aload 7
      // 7f: getfield rip/breeze/Util8.fieldFloat_b F
      // 82: aload 7
      // 84: getfield rip/breeze/Util8.fieldFloat_c F
      // 87: aload 7
      // 89: getfield rip/breeze/Util8.fieldFloat_d F
      // 8c: aload 7
      // 8e: getfield rip/breeze/Util8.fieldFloat_e F
      // 91: aload 7
      // 93: getfield rip/breeze/Util8.fieldFloat_f F
      // 96: aload 7
      // 98: getfield rip/breeze/Util8.fieldFloat_g F
      // 9b: aload 7
      // 9d: getfield rip/breeze/Util8.fieldFloat_h F
      // a0: invokespecial rip/breeze/Util8.<init> (FFFFFFFF)V
      // a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a8: pop
      // a9: lload 4
      // ab: lconst_1
      // ac: ladd
      // ad: lstore 4
      // af: goto 4a
      // b2: goto be
      // b5: astore 2
      // b6: aload 0
      // b7: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // ba: aload 2
      // bb: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // be: return
      // try (3 -> 11): 11 java/lang/Exception
      // try (0 -> 7): 8 java/lang/Exception
      // try (13 -> 29): 82 java/lang/Exception
      // try (30 -> 81): 82 java/lang/Exception
   }

   public void processAll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/MathUtil5.function_e Lorg/mozilla/javascript/Function;
      // 04: ifnull 18
      // 07: aload 0
      // 08: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 0b: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 0e: ifne 1d
      // 11: goto 18
      // 14: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: return
      // 19: invokestatic rip/breeze/MathUtil5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield rip/breeze/MathUtil5.function_e Lorg/mozilla/javascript/Function;
      // 21: aload 0
      // 22: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 25: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 28: aload 0
      // 29: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 2c: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 2f: aconst_null
      // 30: bipush 3
      // 31: anewarray 4
      // 34: dup
      // 35: bipush 0
      // 36: aload 0
      // 37: invokevirtual rip/breeze/MathUtil5.getValue ()I
      // 3a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d: aastore
      // 3e: dup
      // 3f: bipush 1
      // 40: aload 0
      // 41: invokevirtual rip/breeze/MathUtil5.getValue_2 ()I
      // 44: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 47: aastore
      // 48: dup
      // 49: bipush 2
      // 4a: aload 0
      // 4b: invokevirtual rip/breeze/MathUtil5.getFloat ()F
      // 4e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 51: aastore
      // 52: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 57: pop
      // 58: goto 64
      // 5b: astore 1
      // 5c: aload 0
      // 5d: getfield rip/breeze/MathUtil5.dataBuilder17_a Lrip/breeze/ImageUtil15;
      // 60: aload 1
      // 61: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 64: return
      // try (3 -> 11): 11 java/lang/Exception
      // try (0 -> 7): 8 java/lang/Exception
      // try (13 -> 44): 45 java/lang/Exception
   }

   public RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_c;
   }

   @Override
   public boolean isValid() {
      return this.dataBuilder17_a.isValid();
   }

   static {
      long var0 = 29527624449565L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "þïÕht+4'Ýþ\u0095r\tâÕJÚò\u009a/Ù:\u008b®ÆåÛ&\u0080:\u000e\u0003<Ï\u0096®'K\u0007[\u008fC\u009f&)6r\u008fåÁ\u0080é7Âlù÷m¢µT1rÂ Z\u001d\u0095\u0086µÈ\\#G\u009bÈ&ß1\u000e{cr}¶\u008fÄÐ\u007fÿDZ+k2Æ\u0019\u008d\u0011úøõ\u009aæ`Ñ%\r+B\u0093\u0081\u00810³\u001c\r0\u0083\u001c\u000e\u0000ÝW\u0089näC\u008d\u001aë²Ëç\u0091Þ¼\u0012p\u009d×`¢\u001c(\u0086©Õõsþ\u001f^j\u0082v\u0085\u000e¨\u00867äzi8÷IV|Ä;©\u0083\n\r\táÐ3aNVZ5f<\u0011\u001f\u009asÒ\u0084s®\u009eaòzéu\u009e scÇzøA\u009dim \u0083KùX'zyà »VÄú¥¨\u001c\u009c\u00145³aöp\u009e!²Y\u0006\u001aPî\f\u0097épZ{Ä\u008av4\u009d:'¦\u0012¾¦\u008e@\u0098\u008cb¸¶GÍ·¼\u000f\u0014`Ww\u0015+'4¹Êj\u001aú\u0094Ù{q\u00161¬\u0013êng[x©_\u0080<.g&0µÝ\bQ`3î\u0017\u0093ôu¹5\u0083\n6o\u0093¼\u008cí]\u001bjEdQZÔÌú#á·bôÅWä\u0016v";
      int var7 = "þïÕht+4'Ýþ\u0095r\tâÕJÚò\u009a/Ù:\u008b®ÆåÛ&\u0080:\u000e\u0003<Ï\u0096®'K\u0007[\u008fC\u009f&)6r\u008fåÁ\u0080é7Âlù÷m¢µT1rÂ Z\u001d\u0095\u0086µÈ\\#G\u009bÈ&ß1\u000e{cr}¶\u008fÄÐ\u007fÿDZ+k2Æ\u0019\u008d\u0011úøõ\u009aæ`Ñ%\r+B\u0093\u0081\u00810³\u001c\r0\u0083\u001c\u000e\u0000ÝW\u0089näC\u008d\u001aë²Ëç\u0091Þ¼\u0012p\u009d×`¢\u001c(\u0086©Õõsþ\u001f^j\u0082v\u0085\u000e¨\u00867äzi8÷IV|Ä;©\u0083\n\r\táÐ3aNVZ5f<\u0011\u001f\u009asÒ\u0084s®\u009eaòzéu\u009e scÇzøA\u009dim \u0083KùX'zyà »VÄú¥¨\u001c\u009c\u00145³aöp\u009e!²Y\u0006\u001aPî\f\u0097épZ{Ä\u008av4\u009d:'¦\u0012¾¦\u008e@\u0098\u008cb¸¶GÍ·¼\u000f\u0014`Ww\u0015+'4¹Êj\u001aú\u0094Ù{q\u00161¬\u0013êng[x©_\u0080<.g&0µÝ\bQ`3î\u0017\u0093ôu¹5\u0083\n6o\u0093¼\u008cí]\u001bjEdQZÔÌú#á·bôÅWä\u0016v"
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
                     CONST_K = new String[6];
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

                  var6 = "3ctD\u001at\u0086ÅÂúIöÎýY\u0083¹¬\b¾h\u0092Ø\u0090/\u0096´vp\u000e@xp\u0097\u0004\u0088\u00ad\b¨\u0018(\u00ad Òr\u009fVøJ-µã\u001fV;Ýecá\u000e{½iµ=®M\u0099#¢fDBo\u0007\u0099ù\u009ddq£\u000fÏ\u007fkª\u0090ßUáýi\u001c\u001ciëù\\\u000f\u0096Ý\rÇ\u0010-\u0098ðIZ\u001f]\u00adû\u0096l²\u0003\t<mÍÉ³ã¥ù¨äß-%,¼\u0003g\u001cÙ#cæèHÛ4í";
                  var7 = "3ctD\u001at\u0086ÅÂúIöÎýY\u0083¹¬\b¾h\u0092Ø\u0090/\u0096´vp\u000e@xp\u0097\u0004\u0088\u00ad\b¨\u0018(\u00ad Òr\u009fVøJ-µã\u001fV;Ýecá\u000e{½iµ=®M\u0099#¢fDBo\u0007\u0099ù\u009ddq£\u000fÏ\u007fkª\u0090ßUáýi\u001c\u001ciëù\\\u000f\u0096Ý\rÇ\u0010-\u0098ðIZ\u001f]\u00adû\u0096l²\u0003\t<mÍÉ³ã¥ù¨äß-%,¼\u0003g\u001cÙ#cæèHÛ4í"
                     .length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30478;
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
            throw new RuntimeException("rip/breeze/eZ", var10);
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
         throw new RuntimeException("rip/breeze/eZ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
