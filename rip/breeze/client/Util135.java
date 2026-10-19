package rip.breeze.client;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public class Util135 implements Closeable, Flushable {
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private final Writer writer_c;
   private int[] arr_d;
   private int fieldInt_e;
   private String string_f;
   private String string_g;
   private boolean fieldBool_h;
   private boolean fieldBool_i;
   private String string_j;
   private boolean fieldBool_k;
   private static String string_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public Util135(long var1, Writer var3) {
      var1 = 26988050971760L ^ var1;
      long var4 = var1 ^ 137984442959286L;
      super();
      this.arr_d = new int[32];
      this.fieldInt_e = 0;
      this.calculate(6, var4);
      this.string_g = ":";
      this.fieldBool_k = true;
      if (var3 == null) {
         throw new NullPointerException(buildString_2(27556, 7984274571408175072L ^ var1));
      }

      this.writer_c = var3;
   }

   public final void processAll(long param1, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 09: astore 4
      // 0b: aload 3
      // 0c: invokevirtual java/lang/String.length ()I
      // 0f: ifne 29
      // 12: aload 0
      // 13: aconst_null
      // 14: putfield rip/breeze/client/Util135.string_f Ljava/lang/String;
      // 17: aload 0
      // 18: ldc ":"
      // 1a: putfield rip/breeze/client/Util135.string_g Ljava/lang/String;
      // 1d: aload 4
      // 1f: ifnull 44
      // 22: goto 29
      // 25: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 3
      // 2b: putfield rip/breeze/client/Util135.string_f Ljava/lang/String;
      // 2e: aload 0
      // 2f: sipush 3574
      // 32: ldc2_w 1883330712923602989
      // 35: lload 1
      // 36: lxor
      // 37: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 3a: putfield rip/breeze/client/Util135.string_g Ljava/lang/String;
      // 3d: goto 44
      // 40: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: return
      // try (6 -> 17): 18 java/lang/NullPointerException
      // try (9 -> 30): 31 java/lang/NullPointerException
   }

   public final void setBool_h(boolean var1) {
      this.fieldBool_h = var1;
   }

   public boolean isBool_h() {
      return this.fieldBool_h;
   }

   public final void setBool_i(boolean var1) {
      this.fieldBool_i = var1;
   }

   public final boolean isBool_i() {
      return this.fieldBool_i;
   }

   public final void setBool_k(boolean var1) {
      this.fieldBool_k = var1;
   }

   public final boolean isBool_k() {
      return this.fieldBool_k;
   }

   public Util135 getDataBuilder19(long var1) throws IOException {
      var1 = 26988050971760L ^ var1;
      long var3 = var1 ^ 22156590457019L;
      long var5 = var1 ^ 82680294629477L;
      this.processAll_2(var3);
      return this.getDataBuilder19_5(1, "[", var5);
   }

   public Util135 getDataBuilder19_2(long var1) throws IOException {
      var1 = 26988050971760L ^ var1;
      long var3 = var1 ^ 94704527521588L;
      return this.getDataBuilder19_6(1, 2, "]", var3);
   }

   public Util135 getDataBuilder19_3(char var1, long var2) throws IOException {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ 26988050971760L;
      long var6 = var4 ^ 46141295224866L;
      long var8 = var4 ^ 130717893896444L;
      this.processAll_2(var6);
      return this.getDataBuilder19_5(3, "{", var8);
   }

   public Util135 getDataBuilder19_4(long var1) throws IOException {
      var1 = 26988050971760L ^ var1;
      long var3 = var1 ^ 137788506026671L;
      return this.getDataBuilder19_6(3, 5, "}", var3);
   }

   private Util135 getDataBuilder19_5(int var1, String var2, long var3) throws IOException {
      var3 = 26988050971760L ^ var3;
      long var5 = var3 ^ 27107501392709L;
      long var7 = var3 ^ 94916495935491L;
      this.processAll_4(var5);
      this.calculate(var1, var7);
      this.writer_c.write(var2);
      return this;
   }

   private Util135 getDataBuilder19_6(int param1, int param2, String param3, long param4) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 4
      // 05: lxor
      // 06: lstore 4
      // 08: lload 4
      // 0a: dup2
      // 0b: ldc2_w 99857016592620
      // 0e: lxor
      // 0f: lstore 6
      // 11: dup2
      // 12: ldc2_w 62955765750868
      // 15: lxor
      // 16: lstore 8
      // 18: pop2
      // 19: aload 0
      // 1a: lload 6
      // 1c: invokespecial rip/breeze/client/Util135.calculate_2 (J)I
      // 1f: istore 10
      // 21: iload 10
      // 23: iload 2
      // 24: if_icmpeq 4c
      // 27: iload 10
      // 29: iload 1
      // 2a: if_icmpeq 4c
      // 2d: goto 34
      // 30: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: new java/lang/IllegalStateException
      // 37: dup
      // 38: sipush 23635
      // 3b: ldc2_w 3724640523962597914
      // 3e: lload 4
      // 40: lxor
      // 41: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 44: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 47: athrow
      // 48: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 0
      // 4d: lload 4
      // 4f: lconst_0
      // 50: lcmp
      // 51: ifle 87
      // 54: getfield rip/breeze/client/Util135.string_j Ljava/lang/String;
      // 57: ifnull 86
      // 5a: new java/lang/IllegalStateException
      // 5d: dup
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: sipush 27778
      // 68: ldc2_w 6755428507572040412
      // 6b: lload 4
      // 6d: lxor
      // 6e: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: aload 0
      // 75: getfield rip/breeze/client/Util135.string_j Ljava/lang/String;
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 81: athrow
      // 82: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 0
      // 87: dup
      // 88: getfield rip/breeze/client/Util135.fieldInt_e I
      // 8b: bipush 1
      // 8c: isub
      // 8d: putfield rip/breeze/client/Util135.fieldInt_e I
      // 90: lload 4
      // 92: lconst_0
      // 93: lcmp
      // 94: iflt b2
      // 97: iload 10
      // 99: iload 2
      // 9a: if_icmpne aa
      // 9d: aload 0
      // 9e: lload 8
      // a0: invokespecial rip/breeze/client/Util135.processNullable (J)V
      // a3: goto aa
      // a6: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: aload 0
      // ab: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // ae: aload 3
      // af: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // b2: aload 0
      // b3: areturn
      // try (18 -> 24): 25 java/io/IOException
      // try (21 -> 36): 36 java/io/IOException
      // try (38 -> 62): 62 java/io/IOException
      // try (64 -> 80): 81 java/io/IOException
   }

   private void calculate(int var1, long var2) {
      var2 = 26988050971760L ^ var2;
      if (this.fieldInt_e == this.arr_d.length) {
         int[] var4 = new int[this.fieldInt_e * 2];
         System.arraycopy(this.arr_d, 0, var4, 0, this.fieldInt_e);
         this.arr_d = var4;
      }

      this.arr_d[this.fieldInt_e++] = var1;
   }

   private int calculate_2(long var1) {
      var1 = 26988050971760L ^ var1;

      try {
         if (this.fieldInt_e == 0) {
            throw new IllegalStateException(buildString_2(20330, 6598722560396801444L ^ var1));
         }
      } catch (NullPointerException var3) {
         throw getException(var3);
      }

      return this.arr_d[this.fieldInt_e - 1];
   }

   private void calculate_3(int var1) {
      this.arr_d[this.fieldInt_e - 1] = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public Util135 getDataBuilder19_7(String var1, long var2) throws IOException {
      var2 = 26988050971760L ^ var2;

      try {
         if (var1 == null) {
            throw new NullPointerException(buildString_2(15845, 6246463146648319942L ^ var2));
         }
      } catch (IOException var5) {
         throw getException(var5);
      }

      Util135 var10000;
      label46: {
         try {
            var10000 = this;
            if (var2 < 0L) {
               break label46;
            }

            if (this.string_j != null) {
               throw new IllegalStateException();
            }
         } catch (IOException var7) {
            throw getException(var7);
         }

         try {
            var10000 = this;
         } catch (IOException var4) {
            throw getException(var4);
         }
      }

      try {
         if (var2 <= 0L) {
            return var10000;
         }

         if (var10000.fieldInt_e == 0) {
            throw new IllegalStateException(buildString_2(21845, 8994380384543465336L ^ var2));
         }
      } catch (IOException var6) {
         throw getException(var6);
      }

      this.string_j = var1;
      return this;
   }

   private void processAll_2(long var1) throws IOException {
      var1 = 26988050971760L ^ var1;
      long var3 = var1 ^ 129594190177815L;
      long var5 = var1 ^ 69348426630976L;

      try {
         if (this.string_j != null) {
            this.processAll_3(var3);
            this.calculate_4(this.string_j, var5);
            this.string_j = null;
         }
      } catch (IOException var7) {
         throw getException(var7);
      }
   }

   public Util135 getDataBuilder19_8(String var1, byte var2, int var3, int var4) throws IOException {
      long var5 = ((long)var2 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ 26988050971760L;
      long var7 = var5 ^ 48510626458163L;
      long var9 = var5 ^ 126607738410456L;
      long var11 = var5 ^ 13274702974087L;
      long var13 = var5 ^ 12674847822083L;

      try {
         if (var1 == null) {
            return this.getDataBuilder19_9(var11);
         }
      } catch (IOException var15) {
         throw getException(var15);
      }

      this.processAll_2(var7);
      this.processAll_4(var9);
      this.calculate_4(var1, var13);
      return this;
   }

   public Util135 getDataBuilder19_9(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 62155263843012
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 114071336805679
      // 11: lxor
      // 12: lstore 5
      // 14: pop2
      // 15: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 18: astore 7
      // 1a: aload 0
      // 1b: getfield rip/breeze/client/Util135.string_j Ljava/lang/String;
      // 1e: ifnull 57
      // 21: aload 0
      // 22: lload 1
      // 23: lconst_0
      // 24: lcmp
      // 25: iflt 52
      // 28: getfield rip/breeze/client/Util135.fieldBool_k Z
      // 2b: ifeq 4c
      // 2e: goto 35
      // 31: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: lload 3
      // 37: invokespecial rip/breeze/client/Util135.processAll_2 (J)V
      // 3a: lload 1
      // 3b: lconst_0
      // 3c: lcmp
      // 3d: ifle 6f
      // 40: aload 7
      // 42: ifnull 57
      // 45: goto 4c
      // 48: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aconst_null
      // 4e: putfield rip/breeze/client/Util135.string_j Ljava/lang/String;
      // 51: aload 0
      // 52: areturn
      // 53: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 0
      // 58: lload 5
      // 5a: invokespecial rip/breeze/client/Util135.processAll_4 (J)V
      // 5d: aload 0
      // 5e: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 61: sipush 19102
      // 64: ldc2_w 2393510047402812702
      // 67: lload 1
      // 68: lxor
      // 69: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 6c: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // 6f: aload 0
      // 70: areturn
      // try (16 -> 26): 27 java/io/IOException
      // try (19 -> 38): 39 java/io/IOException
      // try (29 -> 46): 46 java/io/IOException
   }

   public Util135 getDataBuilder19_10(long var1, boolean var3) throws IOException {
      var1 = 26988050971760L ^ var1;
      long var4 = var1 ^ 26829575821954L;
      long var6 = var1 ^ 78470473868649L;

      Writer var10000;
      String var10001;
      label17: {
         try {
            this.processAll_2(var4);
            this.processAll_4(var6);
            var10000 = this.writer_c;
            if (var3) {
               var10001 = buildString_2(7866, 296334097442648440L ^ var1);
               break label17;
            }
         } catch (IOException var8) {
            throw getException(var8);
         }

         var10001 = buildString_2(31849, 4262823978166997946L ^ var1);
      }

      var10000.write(var10001);
      return this;
   }

   public Util135 getDataBuilder19_11(long var1, Boolean var3) throws IOException {
      var1 = 26988050971760L ^ var1;
      long var4 = var1 ^ 111589631621022L;
      long var6 = var1 ^ 64070572312693L;
      long var8 = var1 ^ 76353764757802L;

      try {
         if (var3 == null) {
            return this.getDataBuilder19_9(var8);
         }
      } catch (IOException var10) {
         throw getException(var10);
      }

      String var13;
      Writer var10000;
      label30: {
         label29: {
            try {
               this.processAll_2(var4);
               this.processAll_4(var6);
               var10000 = this.writer_c;
               var10001 = var3;
               if (var1 <= 0L) {
                  break label29;
               }

               if (var10001 != 0) {
                  var13 = buildString_2(7208, 3285925810742648556L ^ var1);
                  break label30;
               }
            } catch (IOException var11) {
               throw getException(var11);
            }

            var10001 = 29306;
         }

         var13 = buildString_2(var10001, 600753747877834919L ^ var1);
      }

      var10000.write(var13);
      return this;
   }

   public Util135 getDataBuilder19_12(int var1, long var2, int var4, short var5) throws IOException {
      long var6 = ((long)var1 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ 26988050971760L;
      long var8 = var6 ^ 103237147470958L;
      long var10 = var6 ^ 3144695075717L;
      this.processAll_2(var8);
      this.processAll_4(var10);
      this.writer_c.write(Long.toString(var2));
      return this;
   }

   public Util135 getDataBuilder19_13(Number param1, long param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 78576976861627
      // 0b: lxor
      // 0c: lstore 4
      // 0e: dup2
      // 0f: ldc2_w 26730989708880
      // 12: lxor
      // 13: lstore 6
      // 15: dup2
      // 16: ldc2_w 113778575802127
      // 19: lxor
      // 1a: lstore 8
      // 1c: pop2
      // 1d: aload 1
      // 1e: ifnonnull 2c
      // 21: aload 0
      // 22: lload 8
      // 24: invokevirtual rip/breeze/client/Util135.getDataBuilder19_9 (J)Lrip/breeze/client/Util135;
      // 27: areturn
      // 28: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: lload 4
      // 2f: invokespecial rip/breeze/client/Util135.processAll_2 (J)V
      // 32: aload 1
      // 33: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 36: astore 10
      // 38: aload 0
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt d2
      // 3f: getfield rip/breeze/client/Util135.fieldBool_h Z
      // 42: ifne c1
      // 45: aload 10
      // 47: sipush 18978
      // 4a: ldc2_w 5729683084499445470
      // 4d: lload 2
      // 4e: lxor
      // 4f: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 52: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 55: ifne 99
      // 58: goto 5f
      // 5b: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 10
      // 61: sipush 26193
      // 64: ldc2_w 4639792283630815908
      // 67: lload 2
      // 68: lxor
      // 69: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 6c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6f: ifne 99
      // 72: goto 79
      // 75: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: lload 2
      // 7a: lconst_0
      // 7b: lcmp
      // 7c: ifle d1
      // 7f: aload 10
      // 81: sipush 26720
      // 84: ldc2_w 4148309619684951182
      // 87: lload 2
      // 88: lxor
      // 89: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 8c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8f: ifeq c1
      // 92: goto 99
      // 95: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: new java/lang/IllegalArgumentException
      // 9c: dup
      // 9d: new java/lang/StringBuilder
      // a0: dup
      // a1: invokespecial java/lang/StringBuilder.<init> ()V
      // a4: sipush 2883
      // a7: ldc2_w 1576196457836783521
      // aa: lload 2
      // ab: lxor
      // ac: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2: aload 1
      // b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b9: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // bc: athrow
      // bd: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: aload 0
      // c2: lload 6
      // c4: invokespecial rip/breeze/client/Util135.processAll_4 (J)V
      // c7: aload 0
      // c8: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // cb: aload 10
      // cd: invokevirtual java/io/Writer.append (Ljava/lang/CharSequence;)Ljava/io/Writer;
      // d0: pop
      // d1: aload 0
      // d2: areturn
      // try (18 -> 24): 24 java/io/IOException
      // try (32 -> 47): 48 java/io/IOException
      // try (39 -> 58): 59 java/io/IOException
      // try (50 -> 73): 74 java/io/IOException
      // try (61 -> 92): 92 java/io/IOException
   }

   @Override
   public void flush() throws IOException {
      long var1 = 133502128425046L;

      try {
         if (this.fieldInt_e == 0) {
            throw new IllegalStateException(buildString_2(21845, 8994358221379631763L ^ var1));
         }
      } catch (IOException var3) {
         throw getException(var3);
      }

      this.writer_c.flush();
   }

   @Override
   public void close() throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: ldc2_w 4161214449284
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 0c: invokevirtual java/io/Writer.close ()V
      // 0f: aload 0
      // 10: getfield rip/breeze/client/Util135.fieldInt_e I
      // 13: istore 3
      // 14: iload 3
      // 15: bipush 1
      // 16: if_icmpgt 39
      // 19: iload 3
      // 1a: bipush 1
      // 1b: if_icmpne 50
      // 1e: goto 25
      // 21: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield rip/breeze/client/Util135.arr_d [I
      // 29: iload 3
      // 2a: bipush 1
      // 2b: isub
      // 2c: iaload
      // 2d: bipush 7
      // 2f: if_icmpeq 50
      // 32: goto 39
      // 35: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: new java/io/IOException
      // 3c: dup
      // 3d: sipush 16915
      // 40: ldc2_w 6652565331206807399
      // 43: lload 1
      // 44: lxor
      // 45: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 48: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 4b: athrow
      // 4c: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 0
      // 51: bipush 0
      // 52: putfield rip/breeze/client/Util135.fieldInt_e I
      // 55: return
      // try (10 -> 16): 17 java/io/IOException
      // try (13 -> 27): 28 java/io/IOException
      // try (19 -> 39): 39 java/io/IOException
   }

   private void calculate_4(String param1, long param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/Util135.26988050971760L J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 009: astore 4
      // 00b: aload 0
      // 00c: getfield rip/breeze/client/Util135.fieldBool_i Z
      // 00f: ifeq 01c
      // 012: getstatic rip/breeze/client/Util135.CONST_B [Ljava/lang/String;
      // 015: goto 01f
      // 018: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: getstatic rip/breeze/client/Util135.CONST_A [Ljava/lang/String;
      // 01f: astore 5
      // 021: aload 0
      // 022: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 025: ldc_w "\""
      // 028: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // 02b: bipush 0
      // 02c: istore 6
      // 02e: aload 1
      // 02f: invokevirtual java/lang/String.length ()I
      // 032: istore 7
      // 034: bipush 0
      // 035: istore 8
      // 037: iload 8
      // 039: iload 7
      // 03b: if_icmpge 0fb
      // 03e: aload 1
      // 03f: iload 8
      // 041: invokevirtual java/lang/String.charAt (I)C
      // 044: istore 9
      // 046: iload 9
      // 048: sipush 128
      // 04b: lload 2
      // 04c: lconst_0
      // 04d: lcmp
      // 04e: ifle 07d
      // 051: if_icmpge 078
      // 054: aload 5
      // 056: iload 9
      // 058: aaload
      // 059: astore 10
      // 05b: lload 2
      // 05c: lconst_0
      // 05d: lcmp
      // 05e: iflt 0c1
      // 061: aload 10
      // 063: ifnonnull 0c1
      // 066: aload 4
      // 068: lload 2
      // 069: lconst_0
      // 06a: lcmp
      // 06b: iflt 0f8
      // 06e: ifnull 0f3
      // 071: goto 078
      // 074: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: iload 9
      // 07a: sipush 8232
      // 07d: lload 2
      // 07e: lconst_0
      // 07f: lcmp
      // 080: ifle 0aa
      // 083: if_icmpne 0a5
      // 086: goto 08d
      // 089: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: sipush 27238
      // 090: ldc2_w 2564230472992888957
      // 093: lload 2
      // 094: lxor
      // 095: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 098: astore 10
      // 09a: lload 2
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: iflt 0c1
      // 0a0: aload 4
      // 0a2: ifnull 0c1
      // 0a5: iload 9
      // 0a7: sipush 8233
      // 0aa: if_icmpne 0f3
      // 0ad: goto 0b4
      // 0b0: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: sipush 6303
      // 0b7: ldc2_w 5799672253215468171
      // 0ba: lload 2
      // 0bb: lxor
      // 0bc: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 0bf: astore 10
      // 0c1: iload 6
      // 0c3: iload 8
      // 0c5: lload 2
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 0f0
      // 0cb: if_icmpge 0e4
      // 0ce: aload 0
      // 0cf: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 0d2: aload 1
      // 0d3: iload 6
      // 0d5: iload 8
      // 0d7: iload 6
      // 0d9: isub
      // 0da: invokevirtual java/io/Writer.write (Ljava/lang/String;II)V
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 0e8: aload 10
      // 0ea: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // 0ed: iload 8
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: istore 6
      // 0f3: iinc 8 1
      // 0f6: aload 4
      // 0f8: ifnull 037
      // 0fb: lload 2
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: iflt 12e
      // 101: iload 6
      // 103: lload 2
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 044
      // 109: iload 7
      // 10b: if_icmpge 124
      // 10e: aload 0
      // 10f: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 112: aload 1
      // 113: iload 6
      // 115: iload 7
      // 117: iload 6
      // 119: isub
      // 11a: invokevirtual java/io/Writer.write (Ljava/lang/String;II)V
      // 11d: goto 124
      // 120: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: aload 0
      // 125: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 128: ldc_w "\""
      // 12b: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // 12e: return
      // try (6 -> 11): 11 java/io/IOException
      // try (44 -> 56): 57 java/io/IOException
      // try (50 -> 66): 67 java/io/IOException
      // try (75 -> 84): 85 java/io/IOException
      // try (93 -> 108): 109 java/io/IOException
      // try (122 -> 141): 142 java/io/IOException
   }

   private void processNullable(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:22 from source 19_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 09: astore 3
      // 0a: aload 0
      // 0b: getfield rip/breeze/client/Util135.string_f Ljava/lang/String;
      // 0e: ifnonnull 16
      // 11: return
      // 12: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 1a: ldc_w "\n"
      // 1d: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // 20: bipush 1
      // 21: istore 4
      // 23: aload 0
      // 24: getfield rip/breeze/client/Util135.fieldInt_e I
      // 27: istore 5
      // 29: iload 4
      // 2b: iload 5
      // 2d: if_icmpge 42
      // 30: aload 0
      // 31: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 34: aload 0
      // 35: getfield rip/breeze/client/Util135.string_f Ljava/lang/String;
      // 38: invokevirtual java/io/Writer.write (Ljava/lang/String;)V
      // 3b: iinc 4 1
      // 3e: aload 3
      // 3f: ifnull 29
      // 42: lload 1
      // 43: lconst_0
      // 44: lcmp
      // 45: ifle 3e
      // 48: return
      // try (6 -> 10): 10 java/io/IOException
   }

   private void processAll_3(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 69196665787884
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 102790724735316
      // 11: lxor
      // 12: lstore 5
      // 14: pop2
      // 15: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 18: aload 0
      // 19: lload 3
      // 1a: invokespecial rip/breeze/client/Util135.calculate_2 (J)I
      // 1d: istore 7
      // 1f: astore 8
      // 21: iload 7
      // 23: bipush 5
      // 24: if_icmpne 42
      // 27: aload 0
      // 28: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 2b: bipush 44
      // 2d: invokevirtual java/io/Writer.write (I)V
      // 30: lload 1
      // 31: lconst_0
      // 32: lcmp
      // 33: ifle 77
      // 36: aload 8
      // 38: ifnull 6c
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: lload 1
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 77
      // 48: iload 7
      // 4a: bipush 3
      // 4b: if_icmpeq 6c
      // 4e: goto 55
      // 51: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: new java/lang/IllegalStateException
      // 58: dup
      // 59: sipush 13328
      // 5c: ldc2_w 4152580414148650837
      // 5f: lload 1
      // 60: lxor
      // 61: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 64: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 67: athrow
      // 68: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 0
      // 6d: lload 5
      // 6f: invokespecial rip/breeze/client/Util135.processNullable (J)V
      // 72: aload 0
      // 73: bipush 4
      // 74: invokespecial rip/breeze/client/Util135.calculate_3 (I)V
      // 77: return
      // try (20 -> 33): 34 java/io/IOException
      // try (23 -> 43): 44 java/io/IOException
      // try (36 -> 55): 55 java/io/IOException
   }

   private void processAll_4(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util135.26988050971760L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 13748926034016
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 122126956197080
      // 11: lxor
      // 12: lstore 5
      // 14: pop2
      // 15: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 18: astore 7
      // 1a: aload 0
      // 1b: lload 3
      // 1c: invokespecial rip/breeze/client/Util135.calculate_2 (J)I
      // 1f: tableswitch 181 1 7 101 124 181 152 181 84 41
      // 48: aload 0
      // 49: lload 1
      // 4a: lconst_0
      // 4b: lcmp
      // 4c: ifle 74
      // 4f: getfield rip/breeze/client/Util135.fieldBool_h Z
      // 52: ifne 73
      // 55: goto 5c
      // 58: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: new java/lang/IllegalStateException
      // 5f: dup
      // 60: sipush 18333
      // 63: ldc2_w 6296106405298139468
      // 66: lload 1
      // 67: lxor
      // 68: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // 6b: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 6e: athrow
      // 6f: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: aload 0
      // 74: bipush 7
      // 76: invokespecial rip/breeze/client/Util135.calculate_3 (I)V
      // 79: aload 7
      // 7b: lload 1
      // 7c: lconst_0
      // 7d: lcmp
      // 7e: ifle 91
      // 81: ifnull eb
      // 84: aload 0
      // 85: bipush 2
      // 86: invokespecial rip/breeze/client/Util135.calculate_3 (I)V
      // 89: aload 0
      // 8a: lload 5
      // 8c: invokespecial rip/breeze/client/Util135.processNullable (J)V
      // 8f: aload 7
      // 91: ifnull eb
      // 94: goto 9b
      // 97: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // 9f: bipush 44
      // a1: invokevirtual java/io/Writer.append (C)Ljava/io/Writer;
      // a4: pop
      // a5: aload 0
      // a6: lload 5
      // a8: invokespecial rip/breeze/client/Util135.processNullable (J)V
      // ab: aload 7
      // ad: ifnull eb
      // b0: goto b7
      // b3: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: aload 0
      // b8: getfield rip/breeze/client/Util135.writer_c Ljava/io/Writer;
      // bb: aload 0
      // bc: getfield rip/breeze/client/Util135.string_g Ljava/lang/String;
      // bf: invokevirtual java/io/Writer.append (Ljava/lang/CharSequence;)Ljava/io/Writer;
      // c2: pop
      // c3: aload 0
      // c4: bipush 5
      // c5: invokespecial rip/breeze/client/Util135.calculate_3 (I)V
      // c8: aload 7
      // ca: ifnull eb
      // cd: goto d4
      // d0: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: new java/lang/IllegalStateException
      // d7: dup
      // d8: sipush 23635
      // db: ldc2_w 3724690757568326294
      // de: lload 1
      // df: lxor
      // e0: invokestatic rip/breeze/client/Util135.buildString_2 (IJ)Ljava/lang/String;
      // e3: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // e6: athrow
      // e7: invokestatic rip/breeze/client/Util135.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ea: athrow
      // eb: return
      // try (16 -> 27): 28 java/io/IOException
      // try (20 -> 39): 39 java/io/IOException
      // try (41 -> 58): 59 java/io/IOException
      // try (50 -> 71): 72 java/io/IOException
      // try (61 -> 85): 86 java/io/IOException
      // try (74 -> 97): 97 java/io/IOException
   }

   static {
      long var0 = 36206936997L;
      initialize("d9LaQb");
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[34];
      int var5 = 0;
      String var6 = "eÕk¥+)÷\u0019ì\u008b\u0090ñ,QÈQ\u0010Ç²YÞ\u0080ÏÚ\u0099ûV¢Õ\f0X\u0091 íÚúE\u007fGúÑÄb5\u001e\u0010{*(\u0007Ò\u0014æ0,1ÅnIg=5P:\u000f(?h\f·må>\u000e¡ÿ\u0098+ê,Xäià\u0012¤mµgó\u0018\rq|\u0006\u000e>\u0088ÒÜ\u0014*x2\u009aà\u0010]¢ê{\u009dÕÈN½-·ðÖlU\u009a\u0010CR5\u00922Ë[ë¶-`;æ\u0083\u008b\u0095\u0010\u000eR\u0018Q¤\u007fu\u000f\u009dÑ<ø\u0003YñÐ\u0010æDÁ\u0095\u0085H?òuÏ\u0087Õ¦\u0016rÝ@Ud\u0093~\u0084\u0001iø\u0016\u000f\u008aaÁNúm\u0018yyO\u0081]Q»ÎxaÀ¿ñ%\u0089ªcu\u0088Åh!1\u0000(§\\d\u0002ØPYÞ¯Y*cÝ\u008dN9È½ú)\u0080f\u0010®\u0013;\u0090/ÇÛã0 ÿTÍ\r\u0002w\u0010;\u0002=F\u001d÷\u008e\u0088Ë°wÎ|\u00871\u0088\u0010urñ\u000fÞ\u009adP\u000b\u0096Û\u0080OÎVb(þc\u009f\u009a\u0019\u0006\u0016n\u00ad\u0091<\u0004@\u0002pe\u0082ñØOéhÅ$\u009fÇª3\u0018f\u0005+ëI×U£9\b\u0095\u0010£Jv´o\fÉ\u008b¼L\u0007ÝÈù\n\u001c \u0001\u0088\u001aA÷Ì\u008fm\u0091P÷£Ã3§Ð\u0010dvÛ\u007f\"~\u0006\u0011ëP\u001e\u001e>>²(,\u0001µ\u001dëâª\u0016\u0085ÏºU²Ùµtr`\u0014EI\u00ad·'[\u009eMEé\u0088½$\u0006\u0086(Ï\u0082±úµ\u0010(\u0085\u009b«Wm\nêÔF»]åSF\u0016\u0010\u0080H÷Züäo\u0082Ø$Ü\bÑï\u000e\u0003\u0010SFa*$ì*\u000bþxÂáZ©7'\u0010äKàx¨«\u001cVn\u0091Vk\u0085¸öf0\u00833ÈS_ÃòWVy§\u0000\u0095\u008d\u0004\u0094\u0003ëå\t\u0086\u009e\u0003{ãþW¡\u008bT¤\u0099\u0006»Äy\\\u0004tÌ|s]5\u0086'\u0006â\u0010\u0000¼äÄf ïu*\u0004kCò\u0084\\\u0011 l\u0004Ö\u0017=N\u0007\u0004ãuê\u0098¬,çj\u0016/£Ù\u0095¹Õcl»\u0084$^$\u0099\t\u0010I7\u0001¿$.Ä1ØKxñöñ\u0012° sò\u0099y}\u008c\u0003ÿ\u0002c\u0018ô\\0\u009b½\u0085õéÉP\u000e\u008b£\u0001ù¯{Ì\u0092PG\u0010ÜÊü-Z¿\u0015\u008c\u0000Ì\u008f_\u0088A:÷\u0010ÉÎ¢Åc÷Þ-\u0083\u001c5I\u0087'\u0095xHd¼8¹\\I¡5~>ýF\u00053)>Ë\u0095'm¸\u0005ì\u0084dUz¾Ì£¨\u0094\u008d\u0019}\u00036\u0095c}¢\u0092îf\u001aß\u0005¤0Ý©ë¦¿yFÉÿä|a}\b·\u0080sp\u0096\u001b\u009dk±(\tò\u007f»\u001b\u0083FrJP¬.ö7^8§´ö\u0096\u0018¦¦i\u0087Ð\u0016\u0004uñeJZôZTÔ\u0000\u007fN\u0010ã¢ï\u001b®¾ýe\u0086T\u008aa\bY\tC\u0010pý+MÝÐl²ñ¯L£m9âÙ\u0018q*j\u0090QLp\u0000\u0006\u0093C\u0091t\u0095ø\t×§Dî.¬c}";
      int var7 = "eÕk¥+)÷\u0019ì\u008b\u0090ñ,QÈQ\u0010Ç²YÞ\u0080ÏÚ\u0099ûV¢Õ\f0X\u0091 íÚúE\u007fGúÑÄb5\u001e\u0010{*(\u0007Ò\u0014æ0,1ÅnIg=5P:\u000f(?h\f·må>\u000e¡ÿ\u0098+ê,Xäià\u0012¤mµgó\u0018\rq|\u0006\u000e>\u0088ÒÜ\u0014*x2\u009aà\u0010]¢ê{\u009dÕÈN½-·ðÖlU\u009a\u0010CR5\u00922Ë[ë¶-`;æ\u0083\u008b\u0095\u0010\u000eR\u0018Q¤\u007fu\u000f\u009dÑ<ø\u0003YñÐ\u0010æDÁ\u0095\u0085H?òuÏ\u0087Õ¦\u0016rÝ@Ud\u0093~\u0084\u0001iø\u0016\u000f\u008aaÁNúm\u0018yyO\u0081]Q»ÎxaÀ¿ñ%\u0089ªcu\u0088Åh!1\u0000(§\\d\u0002ØPYÞ¯Y*cÝ\u008dN9È½ú)\u0080f\u0010®\u0013;\u0090/ÇÛã0 ÿTÍ\r\u0002w\u0010;\u0002=F\u001d÷\u008e\u0088Ë°wÎ|\u00871\u0088\u0010urñ\u000fÞ\u009adP\u000b\u0096Û\u0080OÎVb(þc\u009f\u009a\u0019\u0006\u0016n\u00ad\u0091<\u0004@\u0002pe\u0082ñØOéhÅ$\u009fÇª3\u0018f\u0005+ëI×U£9\b\u0095\u0010£Jv´o\fÉ\u008b¼L\u0007ÝÈù\n\u001c \u0001\u0088\u001aA÷Ì\u008fm\u0091P÷£Ã3§Ð\u0010dvÛ\u007f\"~\u0006\u0011ëP\u001e\u001e>>²(,\u0001µ\u001dëâª\u0016\u0085ÏºU²Ùµtr`\u0014EI\u00ad·'[\u009eMEé\u0088½$\u0006\u0086(Ï\u0082±úµ\u0010(\u0085\u009b«Wm\nêÔF»]åSF\u0016\u0010\u0080H÷Züäo\u0082Ø$Ü\bÑï\u000e\u0003\u0010SFa*$ì*\u000bþxÂáZ©7'\u0010äKàx¨«\u001cVn\u0091Vk\u0085¸öf0\u00833ÈS_ÃòWVy§\u0000\u0095\u008d\u0004\u0094\u0003ëå\t\u0086\u009e\u0003{ãþW¡\u008bT¤\u0099\u0006»Äy\\\u0004tÌ|s]5\u0086'\u0006â\u0010\u0000¼äÄf ïu*\u0004kCò\u0084\\\u0011 l\u0004Ö\u0017=N\u0007\u0004ãuê\u0098¬,çj\u0016/£Ù\u0095¹Õcl»\u0084$^$\u0099\t\u0010I7\u0001¿$.Ä1ØKxñöñ\u0012° sò\u0099y}\u008c\u0003ÿ\u0002c\u0018ô\\0\u009b½\u0085õéÉP\u000e\u008b£\u0001ù¯{Ì\u0092PG\u0010ÜÊü-Z¿\u0015\u008c\u0000Ì\u008f_\u0088A:÷\u0010ÉÎ¢Åc÷Þ-\u0083\u001c5I\u0087'\u0095xHd¼8¹\\I¡5~>ýF\u00053)>Ë\u0095'm¸\u0005ì\u0084dUz¾Ì£¨\u0094\u008d\u0019}\u00036\u0095c}¢\u0092îf\u001aß\u0005¤0Ý©ë¦¿yFÉÿä|a}\b·\u0080sp\u0096\u001b\u009dk±(\tò\u007f»\u001b\u0083FrJP¬.ö7^8§´ö\u0096\u0018¦¦i\u0087Ð\u0016\u0004uñeJZôZTÔ\u0000\u007fN\u0010ã¢ï\u001b®¾ýe\u0086T\u008aa\bY\tC\u0010pý+MÝÐl²ñ¯L£m9âÙ\u0018q*j\u0090QLp\u0000\u0006\u0093C\u0091t\u0095ø\t×§Dî.¬c}"
         .length();
      char var8 = 16;
      int var14 = -1;

      label41:
      while (true) {
         String var15 = var6.substring(++var14, var14 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var21;
                  if ((var14 += var8) >= var7) {
                     CONST_N = var4;
                     CONST_O = new String[34];
                     CONST_A = new String[128];
                     int var11 = 0;

                     try {
                        while (var11 <= 31) {
                           CONST_A[var11] = String.format(buildString_2(3816, 7493613949448399558L ^ var0), var11);
                           var11++;
                        }
                     } catch (NullPointerException var12) {
                        throw getException(var12);
                     }

                     CONST_A[34] = buildString_2(29940, 8804200614249222352L ^ var0);
                     CONST_A[92] = buildString_2(30696, 3610919061993542608L ^ var0);
                     CONST_A[9] = buildString_2(25227, 550798034939135660L ^ var0);
                     CONST_A[8] = buildString_2(18792, 8286735091813412171L ^ var0);
                     CONST_A[10] = buildString_2(12655, 4292048406773437777L ^ var0);
                     CONST_A[13] = buildString_2(31029, 6107062112388603146L ^ var0);
                     CONST_A[12] = buildString_2(15368, 7486765053382236220L ^ var0);
                     CONST_B = (String[])CONST_A.clone();
                     CONST_B[60] = buildString_2(29864, 141672648184352904L ^ var0);
                     CONST_B[62] = buildString_2(13444, 4840944456315572380L ^ var0);
                     CONST_B[38] = buildString_2(28299, 8955361208580426427L ^ var0);
                     CONST_B[61] = buildString_2(19917, 2670173872118295015L ^ var0);
                     CONST_B[39] = buildString_2(24507, 9142895023425682338L ^ var0);
                     return;
                  }

                  var8 = var6.charAt(var14);
                  break;
               default:
                  var4[var5++] = var21;
                  if ((var14 += var8) < var7) {
                     var8 = var6.charAt(var14);
                     continue label41;
                  }

                  var6 = "\u008e×Ú@ÁÏ\u0010\u0004ó¹\u009bF\u0007[\u0003Z\u0010\r¯¯B?oö/m#\u0085Hs\u0094èâ";
                  var7 = "\u008e×Ú@ÁÏ\u0010\u0004ó¹\u009bF\u0007[\u0003Z\u0010\r¯¯B?oö/m#\u0085Hs\u0094èâ".length();
                  var8 = 16;
                  var14 = -1;
            }

            var15 = var6.substring(++var14, var14 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(String var0) {
      string_l = var0;
   }

   public static String getString() {
      return string_l;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10140;
      if (CONST_O[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_P.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/cn", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N[var3].getBytes("ISO-8859-1");
         CONST_O[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O[var3];
   }
}
