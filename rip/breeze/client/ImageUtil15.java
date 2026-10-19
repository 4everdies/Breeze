package rip.breeze.client;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public class ImageUtil15<T> {
   final Class<? super T> class_a;
   final Type type_b;
   final int fieldInt_c;
   private static String string_d;
   private static final String CONST_F;

   protected ImageUtil15() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/ImageUtil15.94135721011240L J
      // 03: ldc2_w 33842433689467
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 26076515693434
      // 0d: lxor
      // 0e: dup2
      // 0f: bipush 48
      // 11: lushr
      // 12: l2i
      // 13: istore 3
      // 14: dup2
      // 15: bipush 16
      // 17: lshl
      // 18: bipush 48
      // 1a: lushr
      // 1b: l2i
      // 1c: istore 4
      // 1e: dup2
      // 1f: bipush 32
      // 21: lshl
      // 22: bipush 32
      // 24: lushr
      // 25: l2i
      // 26: istore 5
      // 28: pop2
      // 29: dup2
      // 2a: ldc2_w 117220585350485
      // 2d: lxor
      // 2e: dup2
      // 2f: bipush 32
      // 31: lushr
      // 32: l2i
      // 33: istore 6
      // 35: dup2
      // 36: bipush 32
      // 38: lshl
      // 39: bipush 48
      // 3b: lushr
      // 3c: l2i
      // 3d: istore 7
      // 3f: dup2
      // 40: bipush 48
      // 42: lshl
      // 43: bipush 48
      // 45: lushr
      // 46: l2i
      // 47: istore 8
      // 49: pop2
      // 4a: pop2
      // 4b: aload 0
      // 4c: invokespecial java/lang/Object.<init> ()V
      // 4f: invokestatic rip/breeze/client/ImageUtil15.getString ()Ljava/lang/String;
      // 52: aload 0
      // 53: aload 0
      // 54: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 57: iload 6
      // 59: swap
      // 5a: iload 7
      // 5c: swap
      // 5d: iload 8
      // 5f: i2c
      // 60: swap
      // 61: invokestatic rip/breeze/client/ImageUtil15.getType (IICLjava/lang/Class;)Ljava/lang/reflect/Type;
      // 64: putfield rip/breeze/client/ImageUtil15.type_b Ljava/lang/reflect/Type;
      // 67: aload 0
      // 68: aload 0
      // 69: getfield rip/breeze/client/ImageUtil15.type_b Ljava/lang/reflect/Type;
      // 6c: iload 3
      // 6d: i2c
      // 6e: swap
      // 6f: iload 4
      // 71: i2c
      // 72: iload 5
      // 74: invokestatic rip/breeze/client/Util141.getClass (CLjava/lang/reflect/Type;CI)Ljava/lang/Class;
      // 77: putfield rip/breeze/client/ImageUtil15.class_a Ljava/lang/Class;
      // 7a: aload 0
      // 7b: aload 0
      // 7c: getfield rip/breeze/client/ImageUtil15.type_b Ljava/lang/reflect/Type;
      // 7f: invokevirtual java/lang/Object.hashCode ()I
      // 82: putfield rip/breeze/client/ImageUtil15.fieldInt_c I
      // 85: astore 9
      // 87: aload 9
      // 89: ifnull a5
      // 8c: invokestatic rip/breeze/LicenseState.isValid_2 ()Z
      // 8f: ifne a1
      // 92: goto 99
      // 95: invokestatic rip/breeze/client/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 98: athrow
      // 99: bipush 0
      // 9a: goto a2
      // 9d: invokestatic rip/breeze/client/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a0: athrow
      // a1: bipush 1
      // a2: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // a5: return
      // try (84 -> 88): 89 java/lang/RuntimeException
      // try (86 -> 93): 93 java/lang/RuntimeException
   }

   ImageUtil15(Type var1, long var2) {
      var2 = 94135721011240L ^ var2;
      long var10001 = var2 ^ 39349062041539L;
      int var4 = (int)((var2 ^ 39349062041539L) >>> 48);
      int var5 = (int)((var2 ^ 39349062041539L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 21335913348855L;
      long var9 = var2 ^ 94529181653802L;
      super();
      this.type_b = Util141.getType(var9, (Type)Util67.getObject(var7, var1));
      this.class_a = Util141.getClass((char)var4, this.type_b, (char)var5, var6);
      this.fieldInt_c = this.type_b.hashCode();
   }

   static Type getType(int var0, int var1, char var2, Class var3) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ 94135721011240L;
      long var6 = var4 ^ 103932513589998L;
      getString();
      Type var8 = var3.getGenericSuperclass();

      try {
         if (var8 instanceof Class) {
            throw new RuntimeException(CONST_F);
         }
      } catch (RuntimeException var12) {
         throw getRuntimeException(var12);
      }

      ParameterizedType var10 = (ParameterizedType)var8;

      try {
         Type var10000 = Util141.getType(var6, var10.getActualTypeArguments()[0]);
         if (var0 >= 0 && LicenseState.checkCondition()) {
            initialize("m2UMR");
         }

         return var10000;
      } catch (RuntimeException var11) {
         throw getRuntimeException(var11);
      }
   }

   @Override
   public final int hashCode() {
      return this.fieldInt_c;
   }

   @Override
   public final boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/ImageUtil15.94135721011240L J
      // 03: ldc2_w 43349735284205
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 84463775216419
      // 0d: lxor
      // 0e: dup2
      // 0f: bipush 48
      // 11: lushr
      // 12: l2i
      // 13: istore 4
      // 15: dup2
      // 16: bipush 16
      // 18: lshl
      // 19: bipush 32
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 5
      // 1f: dup2
      // 20: bipush 48
      // 22: lshl
      // 23: bipush 48
      // 25: lushr
      // 26: l2i
      // 27: istore 6
      // 29: pop2
      // 2a: pop2
      // 2b: aload 1
      // 2c: instanceof rip/breeze/client/ImageUtil15
      // 2f: ifeq 5d
      // 32: aload 0
      // 33: getfield rip/breeze/client/ImageUtil15.type_b Ljava/lang/reflect/Type;
      // 36: aload 1
      // 37: checkcast rip/breeze/client/ImageUtil15
      // 3a: getfield rip/breeze/client/ImageUtil15.type_b Ljava/lang/reflect/Type;
      // 3d: iload 4
      // 3f: i2c
      // 40: swap
      // 41: iload 5
      // 43: swap
      // 44: iload 6
      // 46: i2c
      // 47: swap
      // 48: invokestatic rip/breeze/client/Util141.checkCondition_2 (Ljava/lang/reflect/Type;CICLjava/lang/reflect/Type;)Z
      // 4b: ifeq 5d
      // 4e: goto 55
      // 51: invokestatic rip/breeze/client/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5e
      // 59: invokestatic rip/breeze/client/ImageUtil15.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
      // try (29 -> 47): 48 java/lang/RuntimeException
      // try (32 -> 52): 52 java/lang/RuntimeException
   }

   @Override
   public final String toString() {
      long var1 = 108703824246413L;
      long var3 = var1 ^ 57215221602135L;
      return Util141.getString(var3, this.type_b);
   }

   public static ImageUtil15 getDataBuilder17(long var0, Class var2) {
      var0 = 94135721011240L ^ var0;
      long var3 = var0 ^ 115586240879486L;
      return new ImageUtil15(var2, var3);
   }

   public static void initialize(String var0) {
      string_d = var0;
   }

   public static String getString() {
      return string_d;
   }

   static {
      long var0 = 17676347038169L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0015Þìµþ\u009e\u00ad!Ë\u009fø%g±\u009e\u007f{öqâ·:øÐ".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_F = var5;
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
}
