package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class վ {
   public static final char CONST_Ÿ_2 = '+';
   public static final char CONST_Þ_2 = '-';
   public static final char CONST_Ý_2 = '=';
   protected final int int_ü_2;
   private static ջ[] arr_û_2;
   private static final String CONST_C_2;

   protected վ(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/վ.encKey_b_2 J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 79698684342988
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: invokestatic rip/breeze/inject/վ.method_019 ()[Lrip/breeze/inject/ջ;
      // 12: aload 0
      // 13: invokespecial java/lang/Object.<init> ()V
      // 16: astore 6
      // 18: aload 6
      // 1a: ifnull fe
      // 1d: iload 1
      // 1e: ldc 589824
      // 20: if_icmpeq f9
      // 23: goto 2a
      // 26: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: iload 1
      // 2b: ldc 524288
      // 2d: aload 6
      // 2f: lload 2
      // 30: lconst_0
      // 31: lcmp
      // 32: iflt 55
      // 35: ifnull 53
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: if_icmpeq f9
      // 42: goto 49
      // 45: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: iload 1
      // 4a: ldc 458752
      // 4c: goto 53
      // 4f: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: aload 6
      // 55: lload 2
      // 56: lconst_0
      // 57: lcmp
      // 58: ifle 74
      // 5b: ifnull 72
      // 5e: if_icmpeq f9
      // 61: goto 68
      // 64: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 67: athrow
      // 68: iload 1
      // 69: ldc 393216
      // 6b: goto 72
      // 6e: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 71: athrow
      // 72: aload 6
      // 74: lload 2
      // 75: lconst_0
      // 76: lcmp
      // 77: iflt 93
      // 7a: ifnull 91
      // 7d: if_icmpeq f9
      // 80: goto 87
      // 83: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: iload 1
      // 88: ldc 327680
      // 8a: goto 91
      // 8d: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 90: athrow
      // 91: aload 6
      // 93: lload 2
      // 94: lconst_0
      // 95: lcmp
      // 96: ifle b8
      // 99: ifnull b0
      // 9c: if_icmpeq f9
      // 9f: goto a6
      // a2: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a5: athrow
      // a6: iload 1
      // a7: ldc 262144
      // a9: goto b0
      // ac: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // af: athrow
      // b0: lload 2
      // b1: lconst_0
      // b2: lcmp
      // b3: ifle cf
      // b6: aload 6
      // b8: ifnull cf
      // bb: if_icmpeq f9
      // be: goto c5
      // c1: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c4: athrow
      // c5: iload 1
      // c6: ldc 17432576
      // c8: goto cf
      // cb: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ce: athrow
      // cf: if_icmpeq f9
      // d2: new java/lang/IllegalArgumentException
      // d5: dup
      // d6: lload 4
      // d8: iload 1
      // d9: bipush 2
      // da: anewarray 4
      // dd: dup_x1
      // de: swap
      // df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // e2: bipush 1
      // e3: swap
      // e4: aastore
      // e5: dup_x2
      // e6: dup_x2
      // e7: pop
      // e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // eb: bipush 0
      // ec: swap
      // ed: aastore
      // ee: invokestatic rip/breeze/inject/վ.method_017 ([Ljava/lang/Object;)Ljava/lang/String;
      // f1: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // f4: athrow
      // f5: invokestatic rip/breeze/inject/վ.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f8: athrow
      // f9: aload 0
      // fa: iload 1
      // fb: putfield rip/breeze/inject/վ.int_ü_2 I
      // fe: return
      // try (14 -> 19): 20 java/lang/IllegalArgumentException
      // try (16 -> 30): 31 java/lang/IllegalArgumentException
      // try (22 -> 34): 35 java/lang/IllegalArgumentException
      // try (33 -> 39): 40 java/lang/IllegalArgumentException
      // try (42 -> 49): 50 java/lang/IllegalArgumentException
      // try (48 -> 54): 55 java/lang/IllegalArgumentException
      // try (57 -> 64): 65 java/lang/IllegalArgumentException
      // try (63 -> 69): 70 java/lang/IllegalArgumentException
      // try (72 -> 79): 80 java/lang/IllegalArgumentException
      // try (78 -> 84): 85 java/lang/IllegalArgumentException
      // try (87 -> 94): 95 java/lang/IllegalArgumentException
      // try (93 -> 99): 100 java/lang/IllegalArgumentException
      // try (102 -> 125): 125 java/lang/IllegalArgumentException
   }

   private static String invoke_17(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = encKey_b_2 ^ var1;
      return CONST_C_2 + var3;
   }

   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
   }

   public վ invoke_2(Object[] var1) {
      return this;
   }

   public վ invoke_3(Object[] var1) {
      return this;
   }

   public վ invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      return this;
   }

   public վ invoke_5(Object[] var1) {
      return this;
   }

   public վ invoke_6(Object[] var1) {
      long var2 = (Long)var1[0];
      return this;
   }

   public վ invoke_7(Object[] var1) {
      long var2 = (Long)var1[0];
      return this;
   }

   public վ invoke_8(Object[] var1) {
      return this;
   }

   public void invoke_9(Object[] var1) {
      int var2 = (Integer)var1[0];
   }

   public void invoke_10(Object[] var1) {
      String var2 = (String)var1[0];
   }

   public վ invoke_11(Object[] var1) {
      return this;
   }

   public void invoke_12(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
   }

   public void invoke_13(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
   }

   public void invoke_14(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public վ invoke_15(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      return this;
   }

   public void invoke_16(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public static void execute_18(ջ[] var0) {
      arr_û_2 = var0;
   }

   public static ջ[] invoke_19() {
      return arr_û_2;
   }

   static {
      ջ[] var10000 = new ջ[5];
      long var0 = 50303975680717L;
      method_018(var10000);
      Cipher var2;
      Cipher var6 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("i¹H\u0010Gwî\u0017Z?.\u0014\u0006Õú<|Å\u008ft\u001f\u0098\u009eû".getBytes("ISO-8859-1"));
      CONST_C_2 = method_021(var5).intern();
   }

   private static IllegalArgumentException invoke_20(IllegalArgumentException var0) {
      return var0;
   }

   private static String invoke_21(byte[] var0) {
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
