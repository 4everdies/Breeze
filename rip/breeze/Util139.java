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
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

final class Util139 extends BaseFunction {
   final String string_a;
   final MethodHandle methodHandle_b;
   final Class<?> class_c;
   final EnumType8[] arr_d;
   final EnumType8 enum8Val_e;
   final int fieldInt_f;
   final EnumType17 enum_FN_g;
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);

   Util139(Scriptable var1, Scriptable var2, Class<?> var3, String var4, MethodHandle var5, EnumType8[] var6, EnumType8 var7, int var8, EnumType17 var9) {
      super(var1, var2);
      this.class_c = var3;
      this.string_a = var4;
      this.methodHandle_b = var5;
      this.arr_d = var6;
      this.enum8Val_e = var7;
      this.fieldInt_f = var8;
      this.enum_FN_g = var9;
   }

   @Override
   public String getFunctionName() {
      return this.string_a;
   }

   @Override
   public int getLength() {
      return this.fieldInt_f;
   }

   @Override
   public Object call(Context param1, Scriptable param2, Scriptable param3, Object[] param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/Util139.6282615547417L J
      // 003: ldc2_w 114287594483681
      // 006: lxor
      // 007: lstore 5
      // 009: getstatic rip/breeze/Util29.CONST_A [I
      // 00c: aload 0
      // 00d: getfield rip/breeze/Util139.enum_FN_g Lrip/breeze/EnumType17;
      // 010: invokevirtual rip/breeze/EnumType17.ordinal ()I
      // 013: iaload
      // 014: tableswitch 224 1 3 28 45 112
      // 030: aload 0
      // 031: getfield rip/breeze/Util139.methodHandle_b Ljava/lang/invoke/MethodHandle;
      // 034: aload 3
      // 035: invokevirtual java/lang/invoke/MethodHandle.invokeExact (Ljava/lang/Object;)Ljava/lang/Object;
      // 038: astore 7
      // 03a: aload 7
      // 03c: aload 2
      // 03d: invokestatic rip/breeze/Util135.getObject_3 (Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;
      // 040: areturn
      // 041: aload 4
      // 043: ifnull 05e
      // 046: aload 4
      // 048: arraylength
      // 049: ifle 05e
      // 04c: goto 053
      // 04f: invokestatic rip/breeze/Util139.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 4
      // 055: bipush 0
      // 056: aaload
      // 057: goto 061
      // 05a: invokestatic rip/breeze/Util139.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: getstatic org/mozilla/javascript/Undefined.instance Ljava/lang/Object;
      // 061: astore 7
      // 063: aload 1
      // 064: aload 7
      // 066: aload 0
      // 067: getfield rip/breeze/Util139.enum8Val_e Lrip/breeze/EnumType8;
      // 06a: ldc java/lang/Object
      // 06c: invokestatic rip/breeze/Util135.getObject_4 (Lorg/mozilla/javascript/Context;Ljava/lang/Object;Lrip/breeze/EnumType8;Ljava/lang/Class;)Ljava/lang/Object;
      // 06f: astore 8
      // 071: aload 0
      // 072: getfield rip/breeze/Util139.methodHandle_b Ljava/lang/invoke/MethodHandle;
      // 075: aload 3
      // 076: aload 8
      // 078: invokevirtual java/lang/invoke/MethodHandle.invokeExact (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 07b: astore 9
      // 07d: aload 9
      // 07f: aload 2
      // 080: invokestatic rip/breeze/Util135.getObject_3 (Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;
      // 083: areturn
      // 084: aload 0
      // 085: getfield rip/breeze/Util139.class_c Ljava/lang/Class;
      // 088: aload 3
      // 089: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 08c: ifne 0d4
      // 08f: new java/lang/StringBuilder
      // 092: dup
      // 093: invokespecial java/lang/StringBuilder.<init> ()V
      // 096: aload 0
      // 097: getfield rip/breeze/Util139.string_a Ljava/lang/String;
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: sipush 12427
      // 0a0: ldc2_w 7459559328646242103
      // 0a3: lload 5
      // 0a5: lxor
      // 0a6: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ae: aload 0
      // 0af: getfield rip/breeze/Util139.class_c Ljava/lang/Class;
      // 0b2: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 0b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b8: sipush 375
      // 0bb: ldc2_w 9132656271050780362
      // 0be: lload 5
      // 0c0: lxor
      // 0c1: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cc: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 0cf: athrow
      // 0d0: invokestatic rip/breeze/Util139.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: aload 4
      // 0d7: aload 0
      // 0d8: getfield rip/breeze/Util139.arr_d [Lrip/breeze/EnumType8;
      // 0db: aconst_null
      // 0dc: invokestatic rip/breeze/Util135.decrypt (Lorg/mozilla/javascript/Context;[Ljava/lang/Object;[Lrip/breeze/EnumType8;[Ljava/lang/Class;)[Ljava/lang/Object;
      // 0df: astore 7
      // 0e1: aload 0
      // 0e2: getfield rip/breeze/Util139.methodHandle_b Ljava/lang/invoke/MethodHandle;
      // 0e5: aload 3
      // 0e6: aload 7
      // 0e8: invokevirtual java/lang/invoke/MethodHandle.invokeExact (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0eb: astore 8
      // 0ed: aload 8
      // 0ef: aload 2
      // 0f0: invokestatic rip/breeze/Util135.getObject_3 (Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;
      // 0f3: areturn
      // 0f4: sipush 24250
      // 0f7: ldc2_w 1070857869054963972
      // 0fa: lload 5
      // 0fc: lxor
      // 0fd: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 105: athrow
      // 106: astore 7
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: aload 0
      // 110: getfield rip/breeze/Util139.string_a Ljava/lang/String;
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: sipush 27382
      // 119: ldc2_w 2194102768992994633
      // 11c: lload 5
      // 11e: lxor
      // 11f: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12a: aload 7
      // 12c: instanceof java/lang/reflect/InvocationTargetException
      // 12f: ifeq 141
      // 132: aload 7
      // 134: checkcast java/lang/reflect/InvocationTargetException
      // 137: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13a: goto 143
      // 13d: invokestatic rip/breeze/Util139.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 7
      // 143: invokestatic rip/breeze/Util135.getRuntimeException_2 (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
      // 146: athrow
      // try (4 -> 18): 108 java/lang/Throwable
      // try (21 -> 31): 31 java/lang/Throwable
      // try (19 -> 24): 25 java/lang/Throwable
      // try (19 -> 51): 108 java/lang/Throwable
      // try (52 -> 82): 82 java/lang/Throwable
      // try (52 -> 100): 108 java/lang/Throwable
      // try (101 -> 108): 108 java/lang/Throwable
      // try (109 -> 129): 129 java/lang/Throwable
   }

   static {
      long var0 = 119882619022707L;
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
      String var6 = "\u0018±\u001e\u009f²äºb\u0005\u0003ã\u0006\u0081ÐÐÞ%ü,>Éf\u008d¤Pö \u0087z\u0004¯6TM\u0098F\u008d[b7\u0018*í\u0088ì@ýfÐS\u0017e\u0019|\u008ce\u0000\u008bó*\u0093:1PÅ";
      int var7 = "\u0018±\u001e\u009f²äºb\u0005\u0003ã\u0006\u0081ÐÐÞ%ü,>Éf\u008d¤Pö \u0087z\u0004¯6TM\u0098F\u008d[b7\u0018*í\u0088ì@ýfÐS\u0017e\u0019|\u008ce\u0000\u008bó*\u0093:1PÅ"
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
                     CONST_I = var4;
                     CONST_J = new String[4];
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

                  var6 = "m£\u008fô\u001fºß®«\u001e*\u0004Uùÿ\u00896¯ãÈãÜ=\u001c(gÈ}ü\u0094à»iØå\u0005ê\u0012³\u009abäÁjp\u0012J\rV\u009f7ìØFDdg\u0013:ï\u001c6x5²v{\bKfîÙ\u0001]\u0088#\u0012ºã\u0093\u0010¸3\u008b_éÝo¦\u0018`8æ Úùê";
                  var7 = "m£\u008fô\u001fºß®«\u001e*\u0004Uùÿ\u00896¯ãÈãÜ=\u001c(gÈ}ü\u0094à»iØå\u0005ê\u0012³\u009abäÁjp\u0012J\rV\u009f7ìØFDdg\u0013:ï\u001c6x5²v{\bKfîÙ\u0001]\u0088#\u0012ºã\u0093\u0010¸3\u008b_éÝo¦\u0018`8æ Úùê"
                     .length();
                  var8 = 'P';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26182;
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
            throw new RuntimeException("rip/breeze/F", var10);
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
         CONST_J[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
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
         throw new RuntimeException("rip/breeze/F" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
