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
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.ModuleRegistry;

@ScriptNamespace(
   name = "rotationManager",
   description = "The rotation manager.",
   example = "rotationManager.setPriority(10);\n\nrotationManager.onRotate((updateNoRotate) => {\n    // Aim 45° yaw, 10° pitch at 6°/tick\n    rotationManager.rotate(45.0, 10.0, 6.0);\n});\n\nrotationManager.onUpdateNoRotate(() => {\n    // Called when this module has lost priority to another rotation module\n});"
)
public class RotationUtil9 extends HttpUtil4 implements rip.breeze.client.IBreezeInterface2 {
   private final ImageUtil15 dataBuilder17_g;
   private final ModuleRegistry moduleRegistry_h;
   private boolean fieldBool_i;
   private int fieldInt_j;
   private Function function_k;
   private Function function_l;
   private boolean fieldBool_m;
   private static final String[] CONST_O;
   private static final String[] CONST_P;
   private static final Map CONST_Q = new HashMap(13);
   private static final long eka_1;

   public RotationUtil9(ImageUtil15 var1, ModuleRegistry var2) {
      long var3 = 19281552342811L;
      super();
      this.fieldBool_i = false;
      this.fieldInt_j = (int)-2627609894466879483L;
      this.fieldBool_m = false;
      this.dataBuilder17_g = var1;
      this.moduleRegistry_h = var2;
      var1.initialize(this::initialize);
   }

   private void initialize() {
      if (this.fieldBool_i) {
         this.moduleRegistry_h.initialize(this);
      }
   }

   private void processAll() {
      if (!this.fieldBool_i) {
         this.moduleRegistry_h.applyRotation(this);
         this.fieldBool_i = true;
      }
   }

   public void toggle_2(ModuleRegistry param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/RotationUtil9.function_k Lorg/mozilla/javascript/Function;
      // 04: ifnull 18
      // 07: aload 0
      // 08: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 0b: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 0e: ifne 1d
      // 11: goto 18
      // 14: invokestatic rip/breeze/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: return
      // 19: invokestatic rip/breeze/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: bipush 1
      // 1f: putfield rip/breeze/RotationUtil9.fieldBool_m Z
      // 22: aload 0
      // 23: getfield rip/breeze/RotationUtil9.function_k Lorg/mozilla/javascript/Function;
      // 26: aload 0
      // 27: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 2a: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 2d: aload 0
      // 2e: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 31: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 34: aconst_null
      // 35: bipush 0
      // 36: anewarray 109
      // 39: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 3e: pop
      // 3f: goto 4b
      // 42: astore 2
      // 43: aload 0
      // 44: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 47: aload 2
      // 48: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 4b: aload 0
      // 4c: bipush 0
      // 4d: putfield rip/breeze/RotationUtil9.fieldBool_m Z
      // 50: return
      // try (3 -> 11): 11 java/lang/Exception
      // try (0 -> 7): 8 java/lang/Exception
      // try (16 -> 29): 30 java/lang/Exception
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
      // 01: getfield rip/breeze/RotationUtil9.function_l Lorg/mozilla/javascript/Function;
      // 04: ifnull 18
      // 07: aload 0
      // 08: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 0b: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 0e: ifne 1d
      // 11: goto 18
      // 14: invokestatic rip/breeze/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: return
      // 19: invokestatic rip/breeze/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield rip/breeze/RotationUtil9.function_l Lorg/mozilla/javascript/Function;
      // 21: aload 0
      // 22: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 25: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 28: aload 0
      // 29: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 2c: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 2f: aconst_null
      // 30: bipush 1
      // 31: anewarray 109
      // 34: dup
      // 35: bipush 0
      // 36: aload 0
      // 37: getfield rip/breeze/RotationUtil9.function_l Lorg/mozilla/javascript/Function;
      // 3a: aastore
      // 3b: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 40: pop
      // 41: goto 4d
      // 44: astore 1
      // 45: aload 0
      // 46: getfield rip/breeze/RotationUtil9.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 49: aload 1
      // 4a: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 4d: return
      // try (3 -> 11): 11 java/lang/Exception
      // try (0 -> 7): 8 java/lang/Exception
      // try (13 -> 31): 32 java/lang/Exception
   }

   public int getValue() {
      return 10;
   }

   @JSFunction(
      value = "setPriority",
      description = "Set this script’s rotation priority. Higher runs earlier.",
      params = "Integer priority value.",
      example = "rotationManager.setPriority(8);"
   )
   public void update(int var1) {
      long var2 = 125304730839197L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot set priority outside of the script initialization phase.");
      }

      this.fieldInt_j = var1;
   }

   @JSFunction(
      value = "onUpdateNoRotate",
      description = "Register a callback that runs on rotation updates when the module has no priority",
      params = "Function to invoke each update without rotation.",
      example = "rotationManager.onUpdateNoRotate(() => {\n //idle tick \n });"
   )
   public void update_1(Function var1) {
      long var2 = 104852067156043L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot bind onUpdateNoRotate outside of the script initialization phase.");
      }

      this.processAll();
      this.function_l = var1;
   }

   @JSFunction(
      value = "onRotate",
      description = "Register the main rotation callback. This is where you call rotate().",
      params = "Function invoked every tick.",
      example = "rotationManager.onRotate(() => {\n    // Simple aim step\n    rotationManager.rotate(targetYaw, targetPitch, 8.0);\n});"
   )
   public void update_2(Function var1) {
      long var2 = 20397478647673L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot bind onRotate outside of the script initialization phase.");
      }

      this.processAll();
      this.function_k = var1;
   }

   @JSFunction(
      value = "rotate",
      description = "Request a smooth rotation toward the given yaw/pitch at the given speed (degrees per tick). Returns true when the target is reached this call.",
      params = {"Target yaw in degrees.", "Target pitch in degrees.", "Max step (deg/tick)."},
      example = "const done = rotationManager.rotate(90.0, 0.0, 10.0);"
   )
   public boolean checkCondition(float var1, float var2, float var3) {
      long var4 = 111705206220070L;
      if (!this.fieldBool_m) {
         Context.reportError("You can only call rotate from within the onRotate callback.");
         return false;
      } else {
         return this.moduleRegistry_h.absValue(var1, var2, var3);
      }
   }

   @JSFunction(value = "getSpoofedYaw", description = "Get the current spoofed yaw in degrees.", example = "const yaw = rotationManager.getSpoofedYaw();")
   public float getFloat() {
      return this.moduleRegistry_h.getFloat_g();
   }

   @JSFunction(
      value = "getSpoofedPitch",
      description = "Get the current spoofed pitch in degrees.",
      example = "const pitch = rotationManager.getSpoofedPitch();"
   )
   public float getFloat_2() {
      return this.moduleRegistry_h.getFloat();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "RotationManager";
   }

   static {
      long var0 = 75099055705052L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "±\u00adTu9Î[!«¦Ñ8RøLâ\u0093\u0017\u009c\u0087j6Ë\u0016ppã·ÑG=\u008bP´².·i#P±\u0087SZD\u0001hMØk\u0013Úñ8\u009d\\üçùUh\u0091\u00931c\u008dü\u0083°\u009b\u0010+\ne)Ï\u007fð\u009f\u0099úó\u0094ÈÖ7£®8Kl\u0092U<~9\u0004\u008fI¾îÏ\u0081#\u0018\u0093ÙÝ=·¼ÁÂÔ8@\u0012õìîTÄ\u0087§µ|æ1\n`sÄ5fß¢3F\u008cã'B\u007fZÇk\u0096!£ÓSÌ.\u009b\nóÊ\u0085ù\u0086úñk+\bEXG\u009eÃz÷¢¨\u0007À¡Ã\u001bÀ\u0003:o\u000e4`ÊrYàç\u0013[ç\u001c+;ô\u00982\u0018\u007f:5SX/hm·\u0011cLS\u0095n9¢lù\fæá¯ðC";
      int var7 = "±\u00adTu9Î[!«¦Ñ8RøLâ\u0093\u0017\u009c\u0087j6Ë\u0016ppã·ÑG=\u008bP´².·i#P±\u0087SZD\u0001hMØk\u0013Úñ8\u009d\\üçùUh\u0091\u00931c\u008dü\u0083°\u009b\u0010+\ne)Ï\u007fð\u009f\u0099úó\u0094ÈÖ7£®8Kl\u0092U<~9\u0004\u008fI¾îÏ\u0081#\u0018\u0093ÙÝ=·¼ÁÂÔ8@\u0012õìîTÄ\u0087§µ|æ1\n`sÄ5fß¢3F\u008cã'B\u007fZÇk\u0096!£ÓSÌ.\u009b\nóÊ\u0085ù\u0086úñk+\bEXG\u009eÃz÷¢¨\u0007À¡Ã\u001bÀ\u0003:o\u000e4`ÊrYàç\u0013[ç\u001c+;ô\u00982\u0018\u007f:5SX/hm·\u0011cLS\u0095n9¢lù\fæá¯ðC"
         .length();
      char var8 = 'h';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_O = var4;
                     CONST_P = new String[5];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 2540007184024764016L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     -2627609894466879483L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "ñ \u0087\u001b\txÞË\u00ad\u000fÄ\u009c\u001clÜeu\u0006³~âiK\u008cs¬®\u0003MdÔ0<a'¾9R;%¿;ù\u000f£\u001fø¼ÞEÆW\u001eÔö\u0095WÄpñ¡8®@c4^\u0096@Å\u009eïªÁ\f¾\u0006\u0014.\u001adø\u008e3I°G®±¹\u0019\u000bU¢&¥P\u0010>ý;Y\u0013´\u0097)I\u0012·\u0017ÃÒ\u0083ï\u0005 ²§dR`¡{\u009e³Ã\u001bõ~ä\u00adXq31\u009e ó\u0001ÐÖÔW?@)J&uQç\u0093\u009a÷û\u009e|¼-x!¼\u0085K\u009b|%b\u001a$Ò?²\u001e31\f®)ùâ«õ;\u007fHþ\u0090yäö\u0017 \u0086Ë\u009b\u0010ç\u007fë\u0015§\u009aÓ\u0096\u0002ë6LÌys\u0081\u008c(¾0";
                  var7 = "ñ \u0087\u001b\txÞË\u00ad\u000fÄ\u009c\u001clÜeu\u0006³~âiK\u008cs¬®\u0003MdÔ0<a'¾9R;%¿;ù\u000f£\u001fø¼ÞEÆW\u001eÔö\u0095WÄpñ¡8®@c4^\u0096@Å\u009eïªÁ\f¾\u0006\u0014.\u001adø\u008e3I°G®±¹\u0019\u000bU¢&¥P\u0010>ý;Y\u0013´\u0097)I\u0012·\u0017ÃÒ\u0083ï\u0005 ²§dR`¡{\u009e³Ã\u001bõ~ä\u00adXq31\u009e ó\u0001ÐÖÔW?@)J&uQç\u0093\u009a÷û\u009e|¼-x!¼\u0085K\u009b|%b\u001a$Ò?²\u001e31\f®)ùâ«õ;\u007fHþ\u0090yäö\u0017 \u0086Ë\u009b\u0010ç\u007fë\u0015§\u009aÓ\u0096\u0002ë6LÌys\u0081\u008c(¾0"
                     .length();
                  var8 = 'x';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8934;
      if (CONST_P[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aQ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O[var3].getBytes("ISO-8859-1");
         CONST_P[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/aQ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
