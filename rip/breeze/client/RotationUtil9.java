package rip.breeze.client;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public class RotationUtil9 implements Closeable {
   private static final char[] CONST_A;
   private final Reader reader_b;
   private boolean fieldBool_c;
   private final char[] arr_d;
   private int fieldInt_e;
   private int fieldInt_f;
   private int fieldInt_g;
   private int fieldInt_h;
   int fieldInt_i;
   private long fieldLong_j;
   private int fieldInt_k;
   private String string_l;
   private int[] arr_m;
   private int fieldInt_n;
   private String[] arr_o;
   private int[] arr_p;
   private static String[] arr_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long[] CONST_V;
   private static final Integer[] CONST_W;
   private static final Map CONST_X;
   private static final long[] CONST_Y;
   private static final Long[] CONST_Z;
   private static final Map CONST_A_2;

   public RotationUtil9(long param1, Reader param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: aload 0
      // 07: invokespecial java/lang/Object.<init> ()V
      // 0a: aload 0
      // 0b: bipush 0
      // 0c: putfield rip/breeze/client/RotationUtil9.fieldBool_c Z
      // 0f: aload 0
      // 10: sipush 1024
      // 13: newarray 5
      // 15: putfield rip/breeze/client/RotationUtil9.arr_d [C
      // 18: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 1b: aload 0
      // 1c: bipush 0
      // 1d: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 20: aload 0
      // 21: bipush 0
      // 22: putfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 25: aload 0
      // 26: bipush 0
      // 27: putfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 2f: aload 0
      // 30: bipush 0
      // 31: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 34: aload 0
      // 35: bipush 32
      // 37: newarray 10
      // 39: putfield rip/breeze/client/RotationUtil9.arr_m [I
      // 3c: aload 0
      // 3d: bipush 0
      // 3e: putfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 41: aload 0
      // 42: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 45: aload 0
      // 46: dup
      // 47: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 4a: dup_x1
      // 4b: bipush 1
      // 4c: iadd
      // 4d: putfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 50: bipush 6
      // 52: iastore
      // 53: aload 0
      // 54: bipush 32
      // 56: anewarray 79
      // 59: putfield rip/breeze/client/RotationUtil9.arr_o [Ljava/lang/String;
      // 5c: astore 4
      // 5e: aload 0
      // 5f: bipush 32
      // 61: newarray 10
      // 63: putfield rip/breeze/client/RotationUtil9.arr_p [I
      // 66: aload 3
      // 67: ifnonnull 81
      // 6a: new java/lang/NullPointerException
      // 6d: dup
      // 6e: sipush 8736
      // 71: ldc2_w 2245419175334142855
      // 74: lload 1
      // 75: lxor
      // 76: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 79: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 7c: athrow
      // 7d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: aload 0
      // 82: aload 3
      // 83: putfield rip/breeze/client/RotationUtil9.reader_b Ljava/io/Reader;
      // 86: aload 4
      // 88: ifnull a4
      // 8b: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // 8e: ifne a0
      // 91: goto 98
      // 94: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: bipush 0
      // 99: goto a1
      // 9c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f: athrow
      // a0: bipush 1
      // a1: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // a4: return
      // try (52 -> 67): 67 java/lang/NullPointerException
      // try (69 -> 76): 77 java/lang/NullPointerException
      // try (74 -> 81): 81 java/lang/NullPointerException
   }

   public final void setBool_c(boolean var1) {
      this.fieldBool_c = var1;
   }

   public final boolean isBool_c() {
      return this.fieldBool_c;
   }

   public void calculate(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 70386270064805
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 107153909019904
      // 11: lxor
      // 12: lstore 5
      // 14: dup2
      // 15: ldc2_w 83210725556916
      // 18: lxor
      // 19: dup2
      // 1a: bipush 48
      // 1c: lushr
      // 1d: l2i
      // 1e: istore 7
      // 20: dup2
      // 21: bipush 16
      // 23: lshl
      // 24: bipush 32
      // 26: lushr
      // 27: l2i
      // 28: istore 8
      // 2a: dup2
      // 2b: bipush 48
      // 2d: lshl
      // 2e: bipush 48
      // 30: lushr
      // 31: l2i
      // 32: istore 9
      // 34: pop2
      // 35: dup2
      // 36: ldc2_w 65408297146419
      // 39: lxor
      // 3a: lstore 10
      // 3c: pop2
      // 3d: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 40: aload 0
      // 41: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 44: istore 12
      // 46: astore 13
      // 48: iload 12
      // 4a: ifne 5b
      // 4d: aload 0
      // 4e: iload 7
      // 50: i2c
      // 51: iload 8
      // 53: iload 9
      // 55: i2s
      // 56: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 59: istore 12
      // 5b: lload 1
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: iflt 7f
      // 61: iload 12
      // 63: bipush 3
      // 64: if_icmpne 8b
      // 67: aload 0
      // 68: bipush 1
      // 69: lload 10
      // 6b: invokespecial rip/breeze/client/RotationUtil9.calculate_9 (IJ)V
      // 6e: aload 0
      // 6f: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 72: aload 0
      // 73: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 76: bipush 1
      // 77: isub
      // 78: bipush 0
      // 79: iastore
      // 7a: aload 0
      // 7b: bipush 0
      // 7c: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 7f: aload 13
      // 81: ifnull c0
      // 84: goto 8b
      // 87: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: new java/lang/IllegalStateException
      // 8e: dup
      // 8f: new java/lang/StringBuilder
      // 92: dup
      // 93: invokespecial java/lang/StringBuilder.<init> ()V
      // 96: sipush 23857
      // 99: ldc2_w 4699749025261494249
      // 9c: lload 1
      // 9d: lxor
      // 9e: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a4: aload 0
      // a5: lload 3
      // a6: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ac: aload 0
      // ad: lload 5
      // af: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b8: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // bb: athrow
      // bc: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf: athrow
      // c0: return
      // try (56 -> 80): 81 java/io/IOException
      // try (63 -> 105): 105 java/io/IOException
   }

   public void calculate_2(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 108196737542655
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 73766703615066
      // 11: lxor
      // 12: lstore 5
      // 14: dup2
      // 15: ldc2_w 116331625692142
      // 18: lxor
      // 19: dup2
      // 1a: bipush 48
      // 1c: lushr
      // 1d: l2i
      // 1e: istore 7
      // 20: dup2
      // 21: bipush 16
      // 23: lshl
      // 24: bipush 32
      // 26: lushr
      // 27: l2i
      // 28: istore 8
      // 2a: dup2
      // 2b: bipush 48
      // 2d: lshl
      // 2e: bipush 48
      // 30: lushr
      // 31: l2i
      // 32: istore 9
      // 34: pop2
      // 35: pop2
      // 36: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 39: aload 0
      // 3a: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 3d: istore 10
      // 3f: astore 11
      // 41: iload 10
      // 43: ifne 54
      // 46: aload 0
      // 47: iload 7
      // 49: i2c
      // 4a: iload 8
      // 4c: iload 9
      // 4e: i2s
      // 4f: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 52: istore 10
      // 54: lload 1
      // 55: lconst_0
      // 56: lcmp
      // 57: iflt 7e
      // 5a: iload 10
      // 5c: bipush 4
      // 5d: if_icmpne 8a
      // 60: aload 0
      // 61: dup
      // 62: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 65: bipush 1
      // 66: isub
      // 67: putfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 6a: aload 0
      // 6b: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 6e: aload 0
      // 6f: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 72: bipush 1
      // 73: isub
      // 74: dup2
      // 75: iaload
      // 76: bipush 1
      // 77: iadd
      // 78: iastore
      // 79: aload 0
      // 7a: bipush 0
      // 7b: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 7e: aload 11
      // 80: ifnull bf
      // 83: goto 8a
      // 86: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: new java/lang/IllegalStateException
      // 8d: dup
      // 8e: new java/lang/StringBuilder
      // 91: dup
      // 92: invokespecial java/lang/StringBuilder.<init> ()V
      // 95: sipush 9467
      // 98: ldc2_w 8618740722331279220
      // 9b: lload 1
      // 9c: lxor
      // 9d: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: aload 0
      // a4: lload 3
      // a5: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ab: aload 0
      // ac: lload 5
      // ae: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b7: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // ba: athrow
      // bb: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be: athrow
      // bf: return
      // try (52 -> 81): 82 java/io/IOException
      // try (59 -> 106): 106 java/io/IOException
   }

   public void processAll(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 64887044601168
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 29081543332085
      // 11: lxor
      // 12: lstore 5
      // 14: dup2
      // 15: ldc2_w 53505160947521
      // 18: lxor
      // 19: dup2
      // 1a: bipush 48
      // 1c: lushr
      // 1d: l2i
      // 1e: istore 7
      // 20: dup2
      // 21: bipush 16
      // 23: lshl
      // 24: bipush 32
      // 26: lushr
      // 27: l2i
      // 28: istore 8
      // 2a: dup2
      // 2b: bipush 48
      // 2d: lshl
      // 2e: bipush 48
      // 30: lushr
      // 31: l2i
      // 32: istore 9
      // 34: pop2
      // 35: dup2
      // 36: ldc2_w 70895614868934
      // 39: lxor
      // 3a: lstore 10
      // 3c: pop2
      // 3d: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 40: aload 0
      // 41: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 44: istore 12
      // 46: astore 13
      // 48: iload 12
      // 4a: ifne 5b
      // 4d: aload 0
      // 4e: iload 7
      // 50: i2c
      // 51: iload 8
      // 53: iload 9
      // 55: i2s
      // 56: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 59: istore 12
      // 5b: lload 1
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: iflt 73
      // 61: iload 12
      // 63: bipush 1
      // 64: if_icmpne 7f
      // 67: aload 0
      // 68: bipush 3
      // 69: lload 10
      // 6b: invokespecial rip/breeze/client/RotationUtil9.calculate_9 (IJ)V
      // 6e: aload 0
      // 6f: bipush 0
      // 70: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 73: aload 13
      // 75: ifnull b4
      // 78: goto 7f
      // 7b: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: new java/lang/IllegalStateException
      // 82: dup
      // 83: new java/lang/StringBuilder
      // 86: dup
      // 87: invokespecial java/lang/StringBuilder.<init> ()V
      // 8a: sipush 21006
      // 8d: ldc2_w 965768100648006917
      // 90: lload 1
      // 91: lxor
      // 92: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 98: aload 0
      // 99: lload 3
      // 9a: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a0: aload 0
      // a1: lload 5
      // a3: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ac: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // af: athrow
      // b0: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b3: athrow
      // b4: return
      // try (56 -> 72): 73 java/io/IOException
      // try (63 -> 97): 97 java/io/IOException
   }

   public void calculate_3(int param1, char param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 1a: lxor
      // 1b: lstore 4
      // 1d: lload 4
      // 1f: dup2
      // 20: ldc2_w 71698413886516
      // 23: lxor
      // 24: lstore 6
      // 26: dup2
      // 27: ldc2_w 105850346453393
      // 2a: lxor
      // 2b: lstore 8
      // 2d: dup2
      // 2e: ldc2_w 82048964316709
      // 31: lxor
      // 32: dup2
      // 33: bipush 48
      // 35: lushr
      // 36: l2i
      // 37: istore 10
      // 39: dup2
      // 3a: bipush 16
      // 3c: lshl
      // 3d: bipush 32
      // 3f: lushr
      // 40: l2i
      // 41: istore 11
      // 43: dup2
      // 44: bipush 48
      // 46: lshl
      // 47: bipush 48
      // 49: lushr
      // 4a: l2i
      // 4b: istore 12
      // 4d: pop2
      // 4e: pop2
      // 4f: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 52: aload 0
      // 53: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 56: istore 13
      // 58: astore 14
      // 5a: iload 13
      // 5c: ifne 6d
      // 5f: aload 0
      // 60: iload 10
      // 62: i2c
      // 63: iload 11
      // 65: iload 12
      // 67: i2s
      // 68: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 6b: istore 13
      // 6d: iload 2
      // 6e: iflt 9f
      // 71: iload 13
      // 73: bipush 2
      // 74: if_icmpne af
      // 77: aload 0
      // 78: dup
      // 79: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 7c: bipush 1
      // 7d: isub
      // 7e: putfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 81: aload 0
      // 82: getfield rip/breeze/client/RotationUtil9.arr_o [Ljava/lang/String;
      // 85: aload 0
      // 86: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 89: aconst_null
      // 8a: aastore
      // 8b: aload 0
      // 8c: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 8f: aload 0
      // 90: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 93: bipush 1
      // 94: isub
      // 95: dup2
      // 96: iaload
      // 97: bipush 1
      // 98: iadd
      // 99: iastore
      // 9a: aload 0
      // 9b: bipush 0
      // 9c: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 9f: iload 1
      // a0: iflt e6
      // a3: aload 14
      // a5: ifnull e6
      // a8: goto af
      // ab: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: new java/lang/IllegalStateException
      // b2: dup
      // b3: new java/lang/StringBuilder
      // b6: dup
      // b7: invokespecial java/lang/StringBuilder.<init> ()V
      // ba: sipush 25912
      // bd: ldc2_w 4048698133439572809
      // c0: lload 4
      // c2: lxor
      // c3: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c9: aload 0
      // ca: lload 6
      // cc: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // d2: aload 0
      // d3: lload 8
      // d5: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // de: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // e1: athrow
      // e2: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e5: athrow
      // e6: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // e9: iload 3
      // ea: iflt f1
      // ed: ifeq fe
      // f0: bipush 4
      // f1: anewarray 79
      // f4: invokestatic rip/breeze/client/RotationUtil9.initialize ([Ljava/lang/String;)V
      // f7: goto fe
      // fa: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // fd: athrow
      // fe: return
      // try (69 -> 104): 105 java/io/IOException
      // try (74 -> 129): 129 java/io/IOException
      // try (131 -> 138): 139 java/io/IOException
   }

   public boolean checkCondition(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 9221106844506
      // 0b: lxor
      // 0c: dup2
      // 0d: bipush 48
      // 0f: lushr
      // 10: l2i
      // 11: istore 3
      // 12: dup2
      // 13: bipush 16
      // 15: lshl
      // 16: bipush 32
      // 18: lushr
      // 19: l2i
      // 1a: istore 4
      // 1c: dup2
      // 1d: bipush 48
      // 1f: lshl
      // 20: bipush 48
      // 22: lushr
      // 23: l2i
      // 24: istore 5
      // 26: pop2
      // 27: pop2
      // 28: aload 0
      // 29: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 2c: istore 6
      // 2e: iload 6
      // 30: ifne 40
      // 33: aload 0
      // 34: iload 3
      // 35: i2c
      // 36: iload 4
      // 38: iload 5
      // 3a: i2s
      // 3b: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 3e: istore 6
      // 40: iload 6
      // 42: bipush 2
      // 43: lload 1
      // 44: lconst_0
      // 45: lcmp
      // 46: iflt 4f
      // 49: if_icmpeq 61
      // 4c: iload 6
      // 4e: bipush 4
      // 4f: if_icmpeq 61
      // 52: goto 59
      // 55: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 62
      // 5d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: bipush 0
      // 62: ireturn
      // try (42 -> 52): 53 java/io/IOException
      // try (49 -> 57): 57 java/io/IOException
   }

   public EnumType1 getEnum10Val(long var1) throws IOException {
      var1 = 118242208525211L ^ var1;
      long var10001 = var1 ^ 105692668426634L;
      int var3 = (int)((var1 ^ 105692668426634L) >>> 48);
      int var4 = (int)((var1 ^ 105692668426634L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = this.fieldInt_i;
      if (var6 == 0) {
         var6 = this.calculate_4((char)var3, var4, (short)var5);
      }

      try {
         switch (var6) {
            case 1:
               return EnumType1.BEGIN_OBJECT;
            case 2:
               return EnumType1.END_OBJECT;
            case 3:
               return EnumType1.BEGIN_ARRAY;
            case 4:
               return EnumType1.END_ARRAY;
            case 5:
            case 6:
               return EnumType1.BOOLEAN;
            case 7:
               return EnumType1.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
               return EnumType1.STRING;
            case 12:
            case 13:
            case 14:
               return EnumType1.NAME;
            case 15:
            case 16:
               return EnumType1.NUMBER;
            case 17:
               return EnumType1.END_DOCUMENT;
         }
      } catch (IOException var7) {
         throw getException(var7);
      }

      throw new AssertionError();
   }

   int calculate_4(char param1, int param2, short param3) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 01a: lxor
      // 01b: lstore 4
      // 01d: lload 4
      // 01f: dup2
      // 020: ldc2_w 83210986431136
      // 023: lxor
      // 024: dup2
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 6
      // 02b: dup2
      // 02c: bipush 16
      // 02e: lshl
      // 02f: bipush 32
      // 031: lushr
      // 032: l2i
      // 033: istore 7
      // 035: dup2
      // 036: bipush 48
      // 038: lshl
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 8
      // 03f: pop2
      // 040: dup2
      // 041: ldc2_w 6637765982333
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 36140496641284
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 132719548402627
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 81663193763275
      // 059: lxor
      // 05a: dup2
      // 05b: bipush 56
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 15
      // 061: dup2
      // 062: bipush 8
      // 064: lshl
      // 065: bipush 8
      // 067: lushr
      // 068: lstore 16
      // 06a: pop2
      // 06b: dup2
      // 06c: ldc2_w 80499926077703
      // 06f: lxor
      // 070: lstore 18
      // 072: dup2
      // 073: ldc2_w 83170234442695
      // 076: lxor
      // 077: lstore 20
      // 079: dup2
      // 07a: ldc2_w 103507192728109
      // 07d: lxor
      // 07e: lstore 22
      // 080: pop2
      // 081: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 084: aload 0
      // 085: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 088: aload 0
      // 089: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 08c: bipush 1
      // 08d: isub
      // 08e: iaload
      // 08f: istore 24
      // 091: astore 25
      // 093: iload 24
      // 095: bipush 1
      // 096: if_icmpne 0b5
      // 099: aload 0
      // 09a: iload 3
      // 09b: ifge 429
      // 09e: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 0a1: aload 0
      // 0a2: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 0a5: bipush 1
      // 0a6: isub
      // 0a7: bipush 2
      // 0a8: iastore
      // 0a9: aload 25
      // 0ab: ifnull 428
      // 0ae: goto 0b5
      // 0b1: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: iload 24
      // 0b7: bipush 2
      // 0b8: iload 3
      // 0b9: ifge 139
      // 0bc: if_icmpne 136
      // 0bf: goto 0c6
      // 0c2: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: iload 15
      // 0c9: i2b
      // 0ca: lload 16
      // 0cc: bipush 1
      // 0cd: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 0d0: istore 26
      // 0d2: iload 26
      // 0d4: iload 2
      // 0d5: iflt 102
      // 0d8: lookupswitch 62 3 44 53 59 47 93 36
      // 0fc: aload 0
      // 0fd: bipush 4
      // 0fe: dup_x1
      // 0ff: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 102: ireturn
      // 103: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: aload 0
      // 108: lload 18
      // 10a: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 10d: aload 25
      // 10f: iload 1
      // 110: iflt 133
      // 113: ifnull 12d
      // 116: aload 0
      // 117: lload 20
      // 119: sipush 26548
      // 11c: ldc2_w 3043948977071066183
      // 11f: lload 4
      // 121: lxor
      // 122: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 125: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 128: athrow
      // 129: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: iload 1
      // 12e: iflt 434
      // 131: aload 25
      // 133: ifnull 428
      // 136: iload 24
      // 138: bipush 3
      // 139: iload 3
      // 13a: ifge 16b
      // 13d: if_icmpeq 158
      // 140: goto 147
      // 143: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: iload 24
      // 149: bipush 5
      // 14a: iload 3
      // 14b: ifge 290
      // 14e: if_icmpne 28d
      // 151: goto 158
      // 154: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: aload 0
      // 159: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 15c: aload 0
      // 15d: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 160: bipush 1
      // 161: isub
      // 162: bipush 4
      // 163: iastore
      // 164: iload 24
      // 166: iload 3
      // 167: ifgt 1e3
      // 16a: bipush 5
      // 16b: if_icmpne 1d9
      // 16e: goto 175
      // 171: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: aload 0
      // 176: iload 15
      // 178: i2b
      // 179: lload 16
      // 17b: bipush 1
      // 17c: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 17f: istore 26
      // 181: iload 26
      // 183: iload 3
      // 184: ifgt 1ae
      // 187: lookupswitch 59 3 44 50 59 44 125 33
      // 1a8: aload 0
      // 1a9: bipush 2
      // 1aa: dup_x1
      // 1ab: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 1ae: ireturn
      // 1af: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: lload 18
      // 1b6: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 1b9: iload 1
      // 1ba: iflt 1e5
      // 1bd: aload 25
      // 1bf: ifnull 1d9
      // 1c2: aload 0
      // 1c3: lload 20
      // 1c5: sipush 13766
      // 1c8: ldc2_w 151599956956929549
      // 1cb: lload 4
      // 1cd: lxor
      // 1ce: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 1d1: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 1d4: athrow
      // 1d5: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: iload 15
      // 1dc: i2b
      // 1dd: lload 16
      // 1df: bipush 1
      // 1e0: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 1e3: istore 26
      // 1e5: iload 26
      // 1e7: iload 1
      // 1e8: iflt 26b
      // 1eb: lookupswitch 99 3 34 33 39 45 125 59
      // 20c: aload 0
      // 20d: bipush 13
      // 20f: dup_x1
      // 210: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 213: ireturn
      // 214: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: aload 0
      // 219: lload 18
      // 21b: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 21e: aload 0
      // 21f: bipush 12
      // 221: dup_x1
      // 222: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 225: ireturn
      // 226: iload 24
      // 228: iload 2
      // 229: iflt 236
      // 22c: bipush 5
      // 22d: if_icmpeq 23b
      // 230: aload 0
      // 231: bipush 2
      // 232: dup_x1
      // 233: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 236: ireturn
      // 237: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: aload 0
      // 23c: lload 20
      // 23e: sipush 12935
      // 241: ldc2_w 4366857493117852028
      // 244: lload 4
      // 246: lxor
      // 247: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 24a: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 24d: athrow
      // 24e: aload 0
      // 24f: lload 18
      // 251: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 254: aload 0
      // 255: dup
      // 256: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 259: bipush 1
      // 25a: isub
      // 25b: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 25e: aload 0
      // 25f: iload 2
      // 260: iflt 27b
      // 263: iload 26
      // 265: i2c
      // 266: lload 11
      // 268: invokespecial rip/breeze/client/RotationUtil9.isValid (CJ)Z
      // 26b: ifeq 27a
      // 26e: aload 0
      // 26f: bipush 14
      // 271: dup_x1
      // 272: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 275: ireturn
      // 276: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: aload 0
      // 27b: lload 20
      // 27d: sipush 30311
      // 280: ldc2_w 4068545514397212075
      // 283: lload 4
      // 285: lxor
      // 286: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 289: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 28c: athrow
      // 28d: iload 24
      // 28f: bipush 4
      // 290: iload 1
      // 291: iflt 368
      // 294: if_icmpne 364
      // 297: aload 0
      // 298: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 29b: aload 0
      // 29c: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 29f: bipush 1
      // 2a0: isub
      // 2a1: bipush 5
      // 2a2: iastore
      // 2a3: aload 0
      // 2a4: iload 15
      // 2a6: i2b
      // 2a7: lload 16
      // 2a9: bipush 1
      // 2aa: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 2ad: istore 26
      // 2af: iload 2
      // 2b0: iflt 2d0
      // 2b3: iload 26
      // 2b5: lookupswitch 143 2 58 27 61 43
      // 2d0: aload 25
      // 2d2: iload 1
      // 2d3: iflt 361
      // 2d6: ifnull 35b
      // 2d9: goto 2e0
      // 2dc: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2df: athrow
      // 2e0: aload 0
      // 2e1: lload 18
      // 2e3: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 2e6: aload 0
      // 2e7: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 2ea: aload 0
      // 2eb: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 2ee: iload 3
      // 2ef: ifge 320
      // 2f2: if_icmplt 311
      // 2f5: goto 2fc
      // 2f8: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fb: athrow
      // 2fc: iload 2
      // 2fd: ifle 35b
      // 300: aload 0
      // 301: bipush 1
      // 302: lload 9
      // 304: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 307: ifeq 35b
      // 30a: goto 311
      // 30d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 310: athrow
      // 311: iload 2
      // 312: ifle 35b
      // 315: aload 0
      // 316: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 319: aload 0
      // 31a: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 31d: caload
      // 31e: bipush 62
      // 320: if_icmpne 35b
      // 323: goto 32a
      // 326: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: aload 0
      // 32b: dup
      // 32c: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 32f: bipush 1
      // 330: iadd
      // 331: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 334: aload 25
      // 336: iload 1
      // 337: iflt 361
      // 33a: ifnull 35b
      // 33d: goto 344
      // 340: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: aload 0
      // 345: lload 20
      // 347: sipush 15360
      // 34a: ldc2_w 3207759118403360734
      // 34d: lload 4
      // 34f: lxor
      // 350: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 353: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 356: athrow
      // 357: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: iload 1
      // 35c: iflt 434
      // 35f: aload 25
      // 361: ifnull 428
      // 364: iload 24
      // 366: bipush 6
      // 368: iload 2
      // 369: iflt 3b5
      // 36c: if_icmpne 3b1
      // 36f: goto 376
      // 372: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 375: athrow
      // 376: aload 0
      // 377: iload 1
      // 378: iflt 39c
      // 37b: getfield rip/breeze/client/RotationUtil9.fieldBool_c Z
      // 37e: ifeq 39b
      // 381: goto 388
      // 384: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 387: athrow
      // 388: aload 0
      // 389: iload 6
      // 38b: i2s
      // 38c: iload 7
      // 38e: iload 8
      // 390: i2s
      // 391: invokespecial rip/breeze/client/RotationUtil9.calculate_12 (SIS)V
      // 394: goto 39b
      // 397: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39a: athrow
      // 39b: aload 0
      // 39c: iload 2
      // 39d: ifle 429
      // 3a0: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 3a3: aload 0
      // 3a4: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 3a7: bipush 1
      // 3a8: isub
      // 3a9: bipush 7
      // 3ab: iastore
      // 3ac: aload 25
      // 3ae: ifnull 428
      // 3b1: iload 24
      // 3b3: bipush 7
      // 3b5: iload 3
      // 3b6: ifgt 406
      // 3b9: if_icmpne 3fe
      // 3bc: goto 3c3
      // 3bf: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c2: athrow
      // 3c3: aload 0
      // 3c4: iload 15
      // 3c6: i2b
      // 3c7: lload 16
      // 3c9: bipush 0
      // 3ca: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 3cd: istore 26
      // 3cf: iload 2
      // 3d0: ifle 3f5
      // 3d3: iload 26
      // 3d5: bipush -1
      // 3d6: if_icmpne 3e5
      // 3d9: aload 0
      // 3da: bipush 17
      // 3dc: dup_x1
      // 3dd: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 3e0: ireturn
      // 3e1: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: aload 0
      // 3e6: lload 18
      // 3e8: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 3eb: aload 0
      // 3ec: dup
      // 3ed: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 3f0: bipush 1
      // 3f1: isub
      // 3f2: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 3f5: iload 3
      // 3f6: ifgt 434
      // 3f9: aload 25
      // 3fb: ifnull 428
      // 3fe: iload 24
      // 400: iload 2
      // 401: iflt 432
      // 404: bipush 8
      // 406: if_icmpne 428
      // 409: goto 410
      // 40c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40f: athrow
      // 410: new java/lang/IllegalStateException
      // 413: dup
      // 414: sipush 17827
      // 417: ldc2_w 3568195829847109240
      // 41a: lload 4
      // 41c: lxor
      // 41d: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 420: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 423: athrow
      // 424: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 427: athrow
      // 428: aload 0
      // 429: iload 15
      // 42b: i2b
      // 42c: lload 16
      // 42e: bipush 1
      // 42f: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 432: istore 26
      // 434: iload 26
      // 436: iload 2
      // 437: iflt 512
      // 43a: lookupswitch 200 7 34 178 39 164 44 94 59 94 91 186 93 66 123 193
      // 47c: iload 24
      // 47e: bipush 1
      // 47f: iload 3
      // 480: ifge 49f
      // 483: if_icmpne 498
      // 486: goto 48d
      // 489: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48c: athrow
      // 48d: aload 0
      // 48e: bipush 4
      // 48f: dup_x1
      // 490: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 493: ireturn
      // 494: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 497: athrow
      // 498: iload 24
      // 49a: iload 1
      // 49b: iflt 4c6
      // 49e: bipush 1
      // 49f: if_icmpeq 4af
      // 4a2: iload 24
      // 4a4: bipush 2
      // 4a5: if_icmpne 4cb
      // 4a8: goto 4af
      // 4ab: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ae: athrow
      // 4af: aload 0
      // 4b0: lload 18
      // 4b2: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 4b5: aload 0
      // 4b6: dup
      // 4b7: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 4ba: bipush 1
      // 4bb: isub
      // 4bc: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 4bf: aload 0
      // 4c0: bipush 7
      // 4c2: dup_x1
      // 4c3: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 4c6: ireturn
      // 4c7: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ca: athrow
      // 4cb: aload 0
      // 4cc: lload 20
      // 4ce: sipush 22440
      // 4d1: ldc2_w 8632372245444246638
      // 4d4: lload 4
      // 4d6: lxor
      // 4d7: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 4da: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 4dd: athrow
      // 4de: aload 0
      // 4df: lload 18
      // 4e1: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 4e4: aload 0
      // 4e5: bipush 8
      // 4e7: dup_x1
      // 4e8: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 4eb: ireturn
      // 4ec: aload 0
      // 4ed: bipush 9
      // 4ef: dup_x1
      // 4f0: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 4f3: ireturn
      // 4f4: aload 0
      // 4f5: bipush 3
      // 4f6: dup_x1
      // 4f7: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 4fa: ireturn
      // 4fb: aload 0
      // 4fc: bipush 1
      // 4fd: dup_x1
      // 4fe: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 501: ireturn
      // 502: aload 0
      // 503: dup
      // 504: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 507: bipush 1
      // 508: isub
      // 509: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 50c: aload 0
      // 50d: lload 13
      // 50f: invokespecial rip/breeze/client/RotationUtil9.calculate_5 (J)I
      // 512: istore 27
      // 514: iload 27
      // 516: iload 2
      // 517: ifle 52e
      // 51a: ifeq 524
      // 51d: iload 27
      // 51f: ireturn
      // 520: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 523: athrow
      // 524: aload 0
      // 525: lload 22
      // 527: invokespecial rip/breeze/client/RotationUtil9.calculate_6 (J)I
      // 52a: istore 27
      // 52c: iload 27
      // 52e: iload 2
      // 52f: iflt 54b
      // 532: ifeq 53c
      // 535: iload 27
      // 537: ireturn
      // 538: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53b: athrow
      // 53c: aload 0
      // 53d: aload 0
      // 53e: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 541: aload 0
      // 542: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 545: caload
      // 546: lload 11
      // 548: invokespecial rip/breeze/client/RotationUtil9.isValid (CJ)Z
      // 54b: iload 2
      // 54c: iflt 576
      // 54f: ifne 569
      // 552: aload 0
      // 553: lload 20
      // 555: sipush 13855
      // 558: ldc2_w 1966133013524045291
      // 55b: lload 4
      // 55d: lxor
      // 55e: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 561: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 564: athrow
      // 565: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 568: athrow
      // 569: aload 0
      // 56a: lload 18
      // 56c: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 56f: aload 0
      // 570: bipush 10
      // 572: dup_x1
      // 573: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 576: ireturn
      // try (95 -> 110): 111 java/io/IOException
      // try (98 -> 118): 119 java/io/IOException
      // try (128 -> 137): 137 java/io/IOException
      // try (142 -> 155): 155 java/io/IOException
      // try (157 -> 166): 167 java/io/IOException
      // try (161 -> 174): 175 java/io/IOException
      // try (169 -> 190): 191 java/io/IOException
      // try (200 -> 209): 209 java/io/IOException
      // try (214 -> 227): 227 java/io/IOException
      // try (236 -> 245): 245 java/io/IOException
      // try (255 -> 265): 265 java/io/IOException
      // try (276 -> 298): 298 java/io/IOException
      // try (329 -> 337): 338 java/io/IOException
      // try (333 -> 350): 351 java/io/IOException
      // try (340 -> 360): 361 java/io/IOException
      // try (353 -> 372): 373 java/io/IOException
      // try (363 -> 385): 386 java/io/IOException
      // try (375 -> 397): 397 java/io/IOException
      // try (399 -> 408): 409 java/io/IOException
      // try (403 -> 416): 417 java/io/IOException
      // try (411 -> 426): 427 java/io/IOException
      // try (429 -> 446): 447 java/io/IOException
      // try (456 -> 466): 466 java/io/IOException
      // try (468 -> 486): 487 java/io/IOException
      // try (481 -> 498): 498 java/io/IOException
      // try (507 -> 516): 517 java/io/IOException
      // try (511 -> 524): 524 java/io/IOException
      // try (526 -> 534): 535 java/io/IOException
      // try (531 -> 551): 551 java/io/IOException
      // try (595 -> 601): 601 java/io/IOException
      // try (607 -> 613): 613 java/io/IOException
      // try (615 -> 635): 635 java/io/IOException
   }

   private int calculate_5(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 23322694866981
      // 00b: lxor
      // 00c: lstore 3
      // 00d: dup2
      // 00e: ldc2_w 57045087255900
      // 011: lxor
      // 012: lstore 5
      // 014: pop2
      // 015: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 018: aload 0
      // 019: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 01c: aload 0
      // 01d: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 020: caload
      // 021: istore 7
      // 023: astore 8
      // 025: iload 7
      // 027: bipush 116
      // 029: if_icmpeq 040
      // 02c: iload 7
      // 02e: bipush 84
      // 030: lload 1
      // 031: lconst_0
      // 032: lcmp
      // 033: ifle 072
      // 036: if_icmpne 068
      // 039: goto 040
      // 03c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: sipush 1542
      // 043: ldc2_w 7098997605003087244
      // 046: lload 1
      // 047: lxor
      // 048: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 04b: astore 9
      // 04d: sipush 27172
      // 050: ldc2_w 80791382506054065
      // 053: lload 1
      // 054: lxor
      // 055: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 058: astore 10
      // 05a: bipush 5
      // 05b: istore 11
      // 05d: lload 1
      // 05e: lconst_0
      // 05f: lcmp
      // 060: iflt 068
      // 063: aload 8
      // 065: ifnull 110
      // 068: iload 7
      // 06a: lload 1
      // 06b: lconst_0
      // 06c: lcmp
      // 06d: iflt 093
      // 070: bipush 102
      // 072: if_icmpeq 090
      // 075: goto 07c
      // 078: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: iload 7
      // 07e: bipush 70
      // 080: lload 1
      // 081: lconst_0
      // 082: lcmp
      // 083: iflt 0c3
      // 086: if_icmpne 0b9
      // 089: goto 090
      // 08c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: sipush 19325
      // 093: ldc2_w 7047154883182756076
      // 096: lload 1
      // 097: lxor
      // 098: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 09b: astore 9
      // 09d: sipush 7627
      // 0a0: ldc2_w 6475840750275876453
      // 0a3: lload 1
      // 0a4: lxor
      // 0a5: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 0a8: astore 10
      // 0aa: bipush 6
      // 0ac: istore 11
      // 0ae: lload 1
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: iflt 0b9
      // 0b4: aload 8
      // 0b6: ifnull 110
      // 0b9: iload 7
      // 0bb: lload 1
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 0e4
      // 0c1: bipush 110
      // 0c3: if_icmpeq 0e1
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: iload 7
      // 0cf: lload 1
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: ifle 10b
      // 0d5: bipush 78
      // 0d7: if_icmpne 10a
      // 0da: goto 0e1
      // 0dd: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: sipush 2955
      // 0e4: ldc2_w 1456305227490213905
      // 0e7: lload 1
      // 0e8: lxor
      // 0e9: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 0ec: astore 9
      // 0ee: sipush 7756
      // 0f1: ldc2_w 6032622571576808933
      // 0f4: lload 1
      // 0f5: lxor
      // 0f6: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 0f9: astore 10
      // 0fb: bipush 7
      // 0fd: lload 1
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 10b
      // 103: istore 11
      // 105: aload 8
      // 107: ifnull 110
      // 10a: bipush 0
      // 10b: ireturn
      // 10c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 9
      // 112: invokevirtual java/lang/String.length ()I
      // 115: istore 12
      // 117: bipush 1
      // 118: istore 13
      // 11a: iload 13
      // 11c: iload 12
      // 11e: if_icmpge 195
      // 121: aload 0
      // 122: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 125: iload 13
      // 127: iadd
      // 128: aload 0
      // 129: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 12c: lload 1
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: ifle 171
      // 132: if_icmplt 154
      // 135: aload 0
      // 136: iload 13
      // 138: bipush 1
      // 139: iadd
      // 13a: lload 3
      // 13b: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 13e: lload 1
      // 13f: lconst_0
      // 140: lcmp
      // 141: iflt 16a
      // 144: ifne 154
      // 147: goto 14e
      // 14a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: bipush 0
      // 14f: ireturn
      // 150: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: aload 0
      // 155: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 158: aload 0
      // 159: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 15c: iload 13
      // 15e: iadd
      // 15f: caload
      // 160: istore 7
      // 162: lload 1
      // 163: lconst_0
      // 164: lcmp
      // 165: iflt 190
      // 168: iload 7
      // 16a: aload 9
      // 16c: iload 13
      // 16e: invokevirtual java/lang/String.charAt (I)C
      // 171: if_icmpeq 18d
      // 174: iload 7
      // 176: aload 10
      // 178: iload 13
      // 17a: invokevirtual java/lang/String.charAt (I)C
      // 17d: if_icmpeq 18d
      // 180: goto 187
      // 183: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: bipush 0
      // 188: ireturn
      // 189: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: iinc 13 1
      // 190: aload 8
      // 192: ifnull 11a
      // 195: aload 0
      // 196: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 199: iload 12
      // 19b: iadd
      // 19c: lload 1
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: iflt 1da
      // 1a2: aload 0
      // 1a3: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 1a6: lload 1
      // 1a7: lconst_0
      // 1a8: lcmp
      // 1a9: iflt 12c
      // 1ac: if_icmplt 1c8
      // 1af: aload 0
      // 1b0: iload 12
      // 1b2: bipush 1
      // 1b3: iadd
      // 1b4: lload 3
      // 1b5: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 1b8: lload 1
      // 1b9: lconst_0
      // 1ba: lcmp
      // 1bb: iflt 202
      // 1be: ifeq 1f0
      // 1c1: goto 1c8
      // 1c4: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: aload 0
      // 1ca: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 1cd: aload 0
      // 1ce: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1d1: iload 12
      // 1d3: iadd
      // 1d4: caload
      // 1d5: lload 5
      // 1d7: invokespecial rip/breeze/client/RotationUtil9.isValid (CJ)Z
      // 1da: lload 1
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: ifle 202
      // 1e0: ifeq 1f0
      // 1e3: goto 1ea
      // 1e6: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: bipush 0
      // 1eb: ireturn
      // 1ec: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: dup
      // 1f2: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1f5: iload 12
      // 1f7: iadd
      // 1f8: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1fb: aload 0
      // 1fc: iload 11
      // 1fe: dup_x1
      // 1ff: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 202: ireturn
      // try (22 -> 32): 33 java/io/IOException
      // try (49 -> 62): 63 java/io/IOException
      // try (55 -> 72): 73 java/io/IOException
      // try (89 -> 102): 103 java/io/IOException
      // try (95 -> 112): 113 java/io/IOException
      // try (133 -> 137): 137 java/io/IOException
      // try (147 -> 169): 170 java/io/IOException
      // try (158 -> 174): 174 java/io/IOException
      // try (184 -> 198): 199 java/io/IOException
      // try (193 -> 203): 203 java/io/IOException
      // try (208 -> 234): 235 java/io/IOException
      // try (223 -> 252): 253 java/io/IOException
      // try (237 -> 257): 257 java/io/IOException
   }

   private int calculate_6(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 56765308508619
      // 00b: lxor
      // 00c: lstore 3
      // 00d: dup2
      // 00e: ldc2_w 23602201410738
      // 011: lxor
      // 012: lstore 5
      // 014: pop2
      // 015: aload 0
      // 016: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 019: astore 7
      // 01b: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 01e: aload 0
      // 01f: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 022: istore 8
      // 024: aload 0
      // 025: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 028: istore 9
      // 02a: lconst_0
      // 02b: lstore 10
      // 02d: bipush 0
      // 02e: istore 12
      // 030: astore 13
      // 032: bipush 1
      // 033: istore 14
      // 035: bipush 0
      // 036: istore 15
      // 038: bipush 0
      // 039: istore 16
      // 03b: iload 8
      // 03d: iload 16
      // 03f: iadd
      // 040: iload 9
      // 042: if_icmpne 083
      // 045: iload 16
      // 047: lload 1
      // 048: lconst_0
      // 049: lcmp
      // 04a: iflt 062
      // 04d: aload 7
      // 04f: arraylength
      // 050: if_icmpne 059
      // 053: bipush 0
      // 054: ireturn
      // 055: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 0
      // 05a: iload 16
      // 05c: bipush 1
      // 05d: iadd
      // 05e: lload 3
      // 05f: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 062: lload 1
      // 063: lconst_0
      // 064: lcmp
      // 065: iflt 081
      // 068: ifne 077
      // 06b: aload 13
      // 06d: ifnull 2fa
      // 070: goto 077
      // 073: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: aload 0
      // 078: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 07b: istore 8
      // 07d: aload 0
      // 07e: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 081: istore 9
      // 083: aload 7
      // 085: iload 8
      // 087: iload 16
      // 089: iadd
      // 08a: caload
      // 08b: istore 17
      // 08d: iload 17
      // 08f: lload 1
      // 090: lconst_0
      // 091: lcmp
      // 092: ifle 189
      // 095: lookupswitch 242 5 43 126 45 51 46 210 69 159 101 159
      // 0c8: iload 15
      // 0ca: lload 1
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 0ed
      // 0d0: ifne 0eb
      // 0d3: goto 0da
      // 0d6: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: bipush 1
      // 0db: istore 12
      // 0dd: bipush 1
      // 0de: istore 15
      // 0e0: aload 13
      // 0e2: lload 1
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 2f7
      // 0e8: ifnull 2f2
      // 0eb: iload 15
      // 0ed: lload 1
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 10e
      // 0f3: bipush 5
      // 0f4: if_icmpne 10d
      // 0f7: goto 0fe
      // 0fa: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: bipush 6
      // 100: istore 15
      // 102: aload 13
      // 104: lload 1
      // 105: lconst_0
      // 106: lcmp
      // 107: ifle 2f7
      // 10a: ifnull 2f2
      // 10d: bipush 0
      // 10e: ireturn
      // 10f: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: iload 15
      // 115: lload 1
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 12f
      // 11b: bipush 5
      // 11c: if_icmpne 12e
      // 11f: bipush 6
      // 121: istore 15
      // 123: aload 13
      // 125: lload 1
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 2f7
      // 12b: ifnull 2f2
      // 12e: bipush 0
      // 12f: ireturn
      // 130: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: iload 15
      // 136: lload 1
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 154
      // 13c: bipush 2
      // 13d: if_icmpeq 153
      // 140: iload 15
      // 142: lload 1
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 162
      // 148: bipush 4
      // 149: if_icmpne 161
      // 14c: goto 153
      // 14f: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: bipush 5
      // 154: istore 15
      // 156: aload 13
      // 158: lload 1
      // 159: lconst_0
      // 15a: lcmp
      // 15b: iflt 2f7
      // 15e: ifnull 2f2
      // 161: bipush 0
      // 162: ireturn
      // 163: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: iload 15
      // 169: lload 1
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: iflt 182
      // 16f: bipush 2
      // 170: if_icmpne 181
      // 173: bipush 3
      // 174: istore 15
      // 176: aload 13
      // 178: lload 1
      // 179: lconst_0
      // 17a: lcmp
      // 17b: iflt 2f7
      // 17e: ifnull 2f2
      // 181: bipush 0
      // 182: ireturn
      // 183: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: iload 17
      // 189: lload 1
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: ifle 1b0
      // 18f: bipush 48
      // 191: if_icmplt 1a8
      // 194: iload 17
      // 196: bipush 57
      // 198: lload 1
      // 199: lconst_0
      // 19a: lcmp
      // 19b: iflt 1db
      // 19e: if_icmple 1d8
      // 1a1: goto 1a8
      // 1a4: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: iload 17
      // 1ab: lload 5
      // 1ad: invokespecial rip/breeze/client/RotationUtil9.isValid (CJ)Z
      // 1b0: lload 1
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: iflt 1d3
      // 1b6: ifne 1d2
      // 1b9: goto 1c0
      // 1bc: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: lload 1
      // 1c1: lconst_0
      // 1c2: lcmp
      // 1c3: ifle 2fa
      // 1c6: aload 13
      // 1c8: ifnull 2fa
      // 1cb: goto 1d2
      // 1ce: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: bipush 0
      // 1d3: ireturn
      // 1d4: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: iload 15
      // 1da: bipush 1
      // 1db: lload 1
      // 1dc: lconst_0
      // 1dd: lcmp
      // 1de: iflt 1fa
      // 1e1: if_icmpeq 1f6
      // 1e4: iload 15
      // 1e6: lload 1
      // 1e7: lconst_0
      // 1e8: lcmp
      // 1e9: ifle 20f
      // 1ec: ifne 20d
      // 1ef: goto 1f6
      // 1f2: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: iload 17
      // 1f8: bipush 48
      // 1fa: isub
      // 1fb: ineg
      // 1fc: i2l
      // 1fd: lstore 10
      // 1ff: bipush 2
      // 200: istore 15
      // 202: aload 13
      // 204: lload 1
      // 205: lconst_0
      // 206: lcmp
      // 207: iflt 2f7
      // 20a: ifnull 2f2
      // 20d: iload 15
      // 20f: bipush 2
      // 210: lload 1
      // 211: lconst_0
      // 212: lcmp
      // 213: iflt 2af
      // 216: if_icmpne 2ac
      // 219: goto 220
      // 21c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: lload 10
      // 222: lconst_0
      // 223: lload 1
      // 224: lconst_0
      // 225: lcmp
      // 226: iflt 24e
      // 229: lcmp
      // 22a: ifne 23a
      // 22d: goto 234
      // 230: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 233: athrow
      // 234: bipush 0
      // 235: ireturn
      // 236: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: lload 10
      // 23c: sipush 22701
      // 23f: ldc2_w 6220594467798684758
      // 242: lload 1
      // 243: lxor
      // 244: invokestatic rip/breeze/client/RotationUtil9.decrypt_2 (IJ)J
      // 247: lmul
      // 248: iload 17
      // 24a: bipush 48
      // 24c: isub
      // 24d: i2l
      // 24e: lsub
      // 24f: lstore 18
      // 251: iload 14
      // 253: lload 10
      // 255: sipush 2965
      // 258: ldc2_w 8114708709527766892
      // 25b: lload 1
      // 25c: lxor
      // 25d: invokestatic rip/breeze/client/RotationUtil9.decrypt_2 (IJ)J
      // 260: lcmp
      // 261: lload 1
      // 262: lconst_0
      // 263: lcmp
      // 264: ifle 292
      // 267: ifgt 291
      // 26a: lload 10
      // 26c: sipush 18527
      // 26f: ldc2_w 6938879340795069605
      // 272: lload 1
      // 273: lxor
      // 274: invokestatic rip/breeze/client/RotationUtil9.decrypt_2 (IJ)J
      // 277: lcmp
      // 278: ifne 299
      // 27b: goto 282
      // 27e: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 281: athrow
      // 282: lload 18
      // 284: lload 10
      // 286: lcmp
      // 287: ifge 299
      // 28a: goto 291
      // 28d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 290: athrow
      // 291: bipush 1
      // 292: goto 29a
      // 295: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: bipush 0
      // 29a: iand
      // 29b: istore 14
      // 29d: lload 18
      // 29f: lstore 10
      // 2a1: aload 13
      // 2a3: lload 1
      // 2a4: lconst_0
      // 2a5: lcmp
      // 2a6: iflt 2f7
      // 2a9: ifnull 2f2
      // 2ac: iload 15
      // 2ae: bipush 3
      // 2af: lload 1
      // 2b0: lconst_0
      // 2b1: lcmp
      // 2b2: ifle 2d6
      // 2b5: if_icmpne 2cd
      // 2b8: goto 2bf
      // 2bb: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2be: athrow
      // 2bf: bipush 4
      // 2c0: istore 15
      // 2c2: aload 13
      // 2c4: lload 1
      // 2c5: lconst_0
      // 2c6: lcmp
      // 2c7: iflt 2f7
      // 2ca: ifnull 2f2
      // 2cd: iload 15
      // 2cf: lload 1
      // 2d0: lconst_0
      // 2d1: lcmp
      // 2d2: ifle 2f0
      // 2d5: bipush 5
      // 2d6: if_icmpeq 2ee
      // 2d9: goto 2e0
      // 2dc: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2df: athrow
      // 2e0: iload 15
      // 2e2: bipush 6
      // 2e4: if_icmpne 2f2
      // 2e7: goto 2ee
      // 2ea: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ed: athrow
      // 2ee: bipush 7
      // 2f0: istore 15
      // 2f2: iinc 16 1
      // 2f5: aload 13
      // 2f7: ifnull 03b
      // 2fa: iload 15
      // 2fc: bipush 2
      // 2fd: lload 1
      // 2fe: lconst_0
      // 2ff: lcmp
      // 300: iflt 050
      // 303: lload 1
      // 304: lconst_0
      // 305: lcmp
      // 306: iflt 3ad
      // 309: if_icmpne 3a4
      // 30c: iload 14
      // 30e: lload 1
      // 30f: lconst_0
      // 310: lcmp
      // 311: ifle 3a6
      // 314: ifeq 3a4
      // 317: goto 31e
      // 31a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31d: athrow
      // 31e: lload 10
      // 320: sipush 26735
      // 323: ldc2_w 9140965333394760855
      // 326: lload 1
      // 327: lxor
      // 328: invokestatic rip/breeze/client/RotationUtil9.decrypt_2 (IJ)J
      // 32b: lcmp
      // 32c: lload 1
      // 32d: lconst_0
      // 32e: lcmp
      // 32f: iflt 358
      // 332: ifne 34e
      // 335: goto 33c
      // 338: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: iload 12
      // 33e: lload 1
      // 33f: lconst_0
      // 340: lcmp
      // 341: iflt 3a6
      // 344: ifeq 3a4
      // 347: goto 34e
      // 34a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34d: athrow
      // 34e: lload 1
      // 34f: lconst_0
      // 350: lcmp
      // 351: iflt 375
      // 354: lload 10
      // 356: lconst_0
      // 357: lcmp
      // 358: ifne 375
      // 35b: goto 362
      // 35e: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 361: athrow
      // 362: bipush 0
      // 363: iload 12
      // 365: lload 1
      // 366: lconst_0
      // 367: lcmp
      // 368: iflt 3ad
      // 36b: if_icmpne 3a4
      // 36e: goto 375
      // 371: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 374: athrow
      // 375: aload 0
      // 376: iload 12
      // 378: ifeq 38b
      // 37b: goto 382
      // 37e: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 381: athrow
      // 382: lload 10
      // 384: goto 38e
      // 387: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38a: athrow
      // 38b: lload 10
      // 38d: lneg
      // 38e: putfield rip/breeze/client/RotationUtil9.fieldLong_j J
      // 391: aload 0
      // 392: dup
      // 393: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 396: iload 16
      // 398: iadd
      // 399: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 39c: aload 0
      // 39d: bipush 15
      // 39f: dup_x1
      // 3a0: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 3a3: ireturn
      // 3a4: iload 15
      // 3a6: lload 1
      // 3a7: lconst_0
      // 3a8: lcmp
      // 3a9: iflt 3e4
      // 3ac: bipush 2
      // 3ad: if_icmpeq 3d7
      // 3b0: iload 15
      // 3b2: lload 1
      // 3b3: lconst_0
      // 3b4: lcmp
      // 3b5: iflt 3e4
      // 3b8: bipush 4
      // 3b9: if_icmpeq 3d7
      // 3bc: goto 3c3
      // 3bf: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c2: athrow
      // 3c3: iload 15
      // 3c5: lload 1
      // 3c6: lconst_0
      // 3c7: lcmp
      // 3c8: iflt 3ea
      // 3cb: bipush 7
      // 3cd: if_icmpne 3e9
      // 3d0: goto 3d7
      // 3d3: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: iload 16
      // 3da: putfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 3dd: aload 0
      // 3de: bipush 16
      // 3e0: dup_x1
      // 3e1: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 3e4: ireturn
      // 3e5: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e8: athrow
      // 3e9: bipush 0
      // 3ea: ireturn
      // try (40 -> 50): 50 java/io/IOException
      // try (52 -> 65): 66 java/io/IOException
      // try (80 -> 92): 93 java/io/IOException
      // try (99 -> 112): 113 java/io/IOException
      // try (117 -> 125): 125 java/io/IOException
      // try (136 -> 144): 144 java/io/IOException
      // try (146 -> 160): 161 java/io/IOException
      // try (165 -> 173): 173 java/io/IOException
      // try (184 -> 192): 192 java/io/IOException
      // try (194 -> 208): 209 java/io/IOException
      // try (201 -> 220): 221 java/io/IOException
      // try (211 -> 229): 230 java/io/IOException
      // try (223 -> 234): 234 java/io/IOException
      // try (236 -> 249): 250 java/io/IOException
      // try (260 -> 273): 274 java/io/IOException
      // try (266 -> 284): 285 java/io/IOException
      // try (276 -> 289): 289 java/io/IOException
      // try (304 -> 325): 326 java/io/IOException
      // try (317 -> 332): 333 java/io/IOException
      // try (328 -> 337): 337 java/io/IOException
      // try (344 -> 357): 358 java/io/IOException
      // try (362 -> 375): 376 java/io/IOException
      // try (368 -> 381): 382 java/io/IOException
      // try (389 -> 406): 407 java/io/IOException
      // try (400 -> 421): 422 java/io/IOException
      // try (409 -> 430): 431 java/io/IOException
      // try (424 -> 441): 442 java/io/IOException
      // try (433 -> 451): 452 java/io/IOException
      // try (444 -> 457): 458 java/io/IOException
      // try (454 -> 462): 462 java/io/IOException
      // try (478 -> 492): 493 java/io/IOException
      // try (485 -> 502): 503 java/io/IOException
      // try (495 -> 513): 513 java/io/IOException
   }

   private boolean isValid(char var1, long var2) throws IOException {
      var2 = 118242208525211L ^ var2;
      long var4 = var2 ^ 2620682889112L;

      try {
         switch (var1) {
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
               this.setKey(var4);
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
               return false;
            default:
               return true;
         }
      } catch (IOException var6) {
         throw getException(var6);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public String buildString(long var1) throws IOException {
      var1 = 118242208525211L ^ var1;
      long var3 = var1 ^ 27782013220996L;
      long var5 = var1 ^ 61796580220193L;
      long var10001 = var1 ^ 20815897012885L;
      int var7 = (int)((var1 ^ 20815897012885L) >>> 48);
      int var8 = (int)((var1 ^ 20815897012885L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 190790128835L;
      long var12 = var1 ^ 82806057552719L;
      String[] var10000 = getStringArray();
      int var14 = this.fieldInt_i;
      String[] var15 = var10000;
      if (var14 == 0) {
         var14 = this.calculate_4((char)var7, var8, (short)var9);
      }

      String var16;
      label80: {
         label79: {
            label84: {
               int var26 = var14;
               byte var28 = 14;
               if (var1 >= 0L) {
                  if (var14 == 14) {
                     var16 = this.clamp(var12);

                     try {
                        var10000 = var15;
                        if (var1 < 0L) {
                           break label80;
                        }

                        if (var15 == null) {
                           break label84;
                        }
                     } catch (IOException var24) {
                        throw getException(var24);
                     }
                  }

                  try {
                     var26 = var14;
                     var28 = 12;
                  } catch (IOException var19) {
                     throw getException(var19);
                  }
               }

               label68: {
                  label85: {
                     try {
                        if (var1 < 0L) {
                           break label68;
                        }

                        if (var26 != var28) {
                           break label85;
                        }
                     } catch (IOException var23) {
                        throw getException(var23);
                     }

                     var16 = this.buildString_3(var10, '\'');

                     try {
                        var10000 = var15;
                        if (var1 <= 0L) {
                           break label80;
                        }

                        if (var15 == null) {
                           break label84;
                        }
                     } catch (IOException var22) {
                        throw getException(var22);
                     }
                  }

                  try {
                     var26 = var14;
                     var28 = 13;
                  } catch (IOException var18) {
                     throw getException(var18);
                  }
               }

               try {
                  if (var26 != var28) {
                     break label79;
                  }
               } catch (IOException var21) {
                  throw getException(var21);
               }

               var16 = this.buildString_3(var10, '"');

               try {
                  var10000 = var15;
                  if (var1 < 0L) {
                     break label80;
                  }

                  if (var15 != null) {
                     break label79;
                  }
               } catch (IOException var20) {
                  throw getException(var20);
               }
            }

            this.fieldInt_i = 0;
            var10000 = this.arr_o;
            break label80;
         }

         try {
            throw new IllegalStateException(buildString_7(16695, 6430618191397727200L ^ var1) + this.getEnum10Val(var3) + this.buildString_4(var5));
         } catch (IOException var17) {
            throw getException(var17);
         }
      }

      var10000[this.fieldInt_n - 1] = var16;
      return var16;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public String buildString_2(short var1, short var2, int var3) throws IOException {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ 118242208525211L;
      long var6 = var4 ^ 16775698869851L;
      long var8 = var4 ^ 50789190159358L;
      long var10001 = var4 ^ 5411401940042L;
      int var10 = (int)((var4 ^ 5411401940042L) >>> 48);
      int var11 = (int)((var4 ^ 5411401940042L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var4 ^ 24365608419868L;
      long var15 = var4 ^ 102575314591120L;
      String[] var10000 = getStringArray();
      int var17 = this.fieldInt_i;
      String[] var18 = var10000;
      if (var17 == 0) {
         var17 = this.calculate_4((char)var10, var11, (short)var12);
      }

      label179: {
         String var19;
         label165: {
            int var37 = var17;
            byte var38 = 10;
            if (var2 > 0) {
               if (var17 == 10) {
                  var19 = this.clamp(var15);

                  try {
                     if (var2 < 0) {
                        return var19;
                     }

                     if (var18 == null) {
                        break label165;
                     }
                  } catch (IOException var36) {
                     throw getException(var36);
                  }
               }

               try {
                  var37 = var17;
                  var38 = 8;
               } catch (IOException var25) {
                  throw getException(var25);
               }
            }

            label149: {
               label166: {
                  try {
                     if (var1 < 0) {
                        break label149;
                     }

                     if (var37 != var38) {
                        break label166;
                     }
                  } catch (IOException var35) {
                     throw getException(var35);
                  }

                  var19 = this.buildString_3(var13, '\'');

                  try {
                     if (var3 > 0) {
                        return var19;
                     }

                     if (var18 == null) {
                        break label165;
                     }
                  } catch (IOException var34) {
                     throw getException(var34);
                  }
               }

               try {
                  var37 = var17;
                  var38 = 9;
               } catch (IOException var24) {
                  throw getException(var24);
               }
            }

            label135: {
               label167: {
                  try {
                     if (var1 < 0) {
                        break label135;
                     }

                     if (var37 != var38) {
                        break label167;
                     }
                  } catch (IOException var33) {
                     throw getException(var33);
                  }

                  var19 = this.buildString_3(var13, '"');

                  try {
                     if (var2 < 0) {
                        return var19;
                     }

                     if (var18 == null) {
                        break label165;
                     }
                  } catch (IOException var32) {
                     throw getException(var32);
                  }
               }

               try {
                  var37 = var17;
                  var38 = 11;
               } catch (IOException var23) {
                  throw getException(var23);
               }
            }

            label121: {
               label168: {
                  try {
                     if (var1 < 0) {
                        break label121;
                     }

                     if (var37 != var38) {
                        break label168;
                     }
                  } catch (IOException var31) {
                     throw getException(var31);
                  }

                  var19 = this.string_l;

                  try {
                     this.string_l = null;
                     if (var3 > 0) {
                        return var19;
                     }

                     if (var18 == null) {
                        break label165;
                     }
                  } catch (IOException var30) {
                     throw getException(var30);
                  }
               }

               try {
                  var37 = var17;
                  var38 = 15;
               } catch (IOException var22) {
                  throw getException(var22);
               }
            }

            label107: {
               label169: {
                  try {
                     if (var1 < 0) {
                        break label107;
                     }

                     if (var37 != var38) {
                        break label169;
                     }
                  } catch (IOException var29) {
                     throw getException(var29);
                  }

                  var19 = Long.toString(this.fieldLong_j);

                  try {
                     if (var3 >= 0) {
                        return var19;
                     }

                     if (var18 == null) {
                        break label165;
                     }
                  } catch (IOException var28) {
                     throw getException(var28);
                  }
               }

               try {
                  var37 = var17;
                  var38 = 16;
               } catch (IOException var21) {
                  throw getException(var21);
               }
            }

            try {
               if (var37 != var38) {
                  break label179;
               }
            } catch (IOException var27) {
               throw getException(var27);
            }

            var19 = new String(this.arr_d, this.fieldInt_e, this.fieldInt_k);

            try {
               this.fieldInt_e = this.fieldInt_e + this.fieldInt_k;
               if (var3 > 0) {
                  return var19;
               }

               if (var18 != null) {
                  break label179;
               }
            } catch (IOException var26) {
               throw getException(var26);
            }
         }

         this.fieldInt_i = 0;
         this.arr_p[this.fieldInt_n - 1]++;
         return var19;
      }

      try {
         throw new IllegalStateException(buildString_7(26710, 1262872848582710351L ^ var4) + this.getEnum10Val(var6) + this.buildString_4(var8));
      } catch (IOException var20) {
         throw getException(var20);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public boolean checkCondition_2(long var1) throws IOException {
      var1 = 118242208525211L ^ var1;
      long var3 = var1 ^ 118735745015417L;
      long var5 = var1 ^ 81973541764060L;
      long var10001 = var1 ^ 105927932218472L;
      int var7 = (int)((var1 ^ 105927932218472L) >>> 48);
      int var8 = (int)((var1 ^ 105927932218472L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      int var10 = this.fieldInt_i;
      if (var10 == 0) {
         var10 = this.calculate_4((char)var7, var8, (short)var9);
      }

      int var10000;
      label39: {
         label38: {
            try {
               var10000 = var10;
               var16 = 5;
               if (var1 < 0L) {
                  break label38;
               }

               if (var10 == 5) {
                  this.fieldInt_i = 0;
                  this.arr_p[this.fieldInt_n - 1]++;
                  return true;
               }
            } catch (IOException var14) {
               throw getException(var14);
            }

            try {
               var10000 = var10;
               if (var1 <= 0L) {
                  break label39;
               }

               var16 = 6;
            } catch (IOException var13) {
               throw getException(var13);
            }
         }

         try {
            if (var10000 != var16) {
               throw new IllegalStateException(buildString_7(23029, 1789122691443529159L ^ var1) + this.getEnum10Val(var3) + this.buildString_4(var5));
            }

            this.fieldInt_i = 0;
            this.arr_p[this.fieldInt_n - 1]++;
            var10000 = 0;
         } catch (IOException var12) {
            throw getException(var12);
         }
      }

      try {
         return (boolean)var10000;
      } catch (IOException var11) {
         throw getException(var11);
      }
   }

   public void calculate_7(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 138807289191850
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 104789503064079
      // 11: lxor
      // 12: lstore 5
      // 14: dup2
      // 15: ldc2_w 129280697225147
      // 18: lxor
      // 19: dup2
      // 1a: bipush 48
      // 1c: lushr
      // 1d: l2i
      // 1e: istore 7
      // 20: dup2
      // 21: bipush 16
      // 23: lshl
      // 24: bipush 32
      // 26: lushr
      // 27: l2i
      // 28: istore 8
      // 2a: dup2
      // 2b: bipush 48
      // 2d: lshl
      // 2e: bipush 48
      // 30: lushr
      // 31: l2i
      // 32: istore 9
      // 34: pop2
      // 35: pop2
      // 36: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 39: aload 0
      // 3a: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 3d: istore 10
      // 3f: astore 11
      // 41: iload 10
      // 43: ifne 54
      // 46: aload 0
      // 47: iload 7
      // 49: i2c
      // 4a: iload 8
      // 4c: iload 9
      // 4e: i2s
      // 4f: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 52: istore 10
      // 54: lload 1
      // 55: lconst_0
      // 56: lcmp
      // 57: iflt 75
      // 5a: iload 10
      // 5c: bipush 7
      // 5e: if_icmpne 81
      // 61: aload 0
      // 62: bipush 0
      // 63: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 66: aload 0
      // 67: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 6a: aload 0
      // 6b: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 6e: bipush 1
      // 6f: isub
      // 70: dup2
      // 71: iaload
      // 72: bipush 1
      // 73: iadd
      // 74: iastore
      // 75: aload 11
      // 77: ifnull b6
      // 7a: goto 81
      // 7d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: new java/lang/IllegalStateException
      // 84: dup
      // 85: new java/lang/StringBuilder
      // 88: dup
      // 89: invokespecial java/lang/StringBuilder.<init> ()V
      // 8c: sipush 4881
      // 8f: ldc2_w 1533131508991663332
      // 92: lload 1
      // 93: lxor
      // 94: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: aload 0
      // 9b: lload 3
      // 9c: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 9f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a2: aload 0
      // a3: lload 5
      // a5: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ae: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // b1: athrow
      // b2: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: return
      // try (52 -> 75): 76 java/io/IOException
      // try (59 -> 100): 100 java/io/IOException
   }

   public double calculateDouble(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 18797518468077
      // 00b: lxor
      // 00c: lstore 3
      // 00d: dup2
      // 00e: ldc2_w 53223257282120
      // 011: lxor
      // 012: lstore 5
      // 014: dup2
      // 015: ldc2_w 29354864927228
      // 018: lxor
      // 019: dup2
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 7
      // 020: dup2
      // 021: bipush 16
      // 023: lshl
      // 024: bipush 32
      // 026: lushr
      // 027: l2i
      // 028: istore 8
      // 02a: dup2
      // 02b: bipush 48
      // 02d: lshl
      // 02e: bipush 48
      // 030: lushr
      // 031: l2i
      // 032: istore 9
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 9278363803562
      // 039: lxor
      // 03a: lstore 10
      // 03c: dup2
      // 03d: ldc2_w 73752839389222
      // 040: lxor
      // 041: lstore 12
      // 043: pop2
      // 044: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 047: aload 0
      // 048: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 04b: istore 14
      // 04d: astore 15
      // 04f: iload 14
      // 051: ifne 062
      // 054: aload 0
      // 055: iload 7
      // 057: i2c
      // 058: iload 8
      // 05a: iload 9
      // 05c: i2s
      // 05d: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 060: istore 14
      // 062: iload 14
      // 064: bipush 15
      // 066: lload 1
      // 067: lconst_0
      // 068: lcmp
      // 069: iflt 091
      // 06c: if_icmpne 08d
      // 06f: aload 0
      // 070: bipush 0
      // 071: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 074: aload 0
      // 075: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 078: aload 0
      // 079: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 07c: bipush 1
      // 07d: isub
      // 07e: dup2
      // 07f: iaload
      // 080: bipush 1
      // 081: iadd
      // 082: iastore
      // 083: aload 0
      // 084: getfield rip/breeze/client/RotationUtil9.fieldLong_j J
      // 087: l2d
      // 088: dreturn
      // 089: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: iload 14
      // 08f: bipush 16
      // 091: lload 1
      // 092: lconst_0
      // 093: lcmp
      // 094: iflt 0da
      // 097: if_icmpne 0d0
      // 09a: aload 0
      // 09b: new java/lang/String
      // 09e: dup
      // 09f: aload 0
      // 0a0: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 0a3: aload 0
      // 0a4: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0a7: aload 0
      // 0a8: getfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 0ab: invokespecial java/lang/String.<init> ([CII)V
      // 0ae: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 0b1: aload 0
      // 0b2: dup
      // 0b3: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0b6: aload 0
      // 0b7: getfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 0ba: iadd
      // 0bb: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0be: lload 1
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 1b0
      // 0c4: aload 15
      // 0c6: ifnull 1a1
      // 0c9: goto 0d0
      // 0cc: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: lload 1
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: iflt 0f8
      // 0d6: iload 14
      // 0d8: bipush 8
      // 0da: if_icmpeq 0f8
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: iload 14
      // 0e6: bipush 9
      // 0e8: lload 1
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iflt 12c
      // 0ee: if_icmpne 128
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: aload 0
      // 0fa: iload 14
      // 0fc: bipush 8
      // 0fe: if_icmpne 111
      // 101: goto 108
      // 104: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: bipush 39
      // 10a: goto 113
      // 10d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: bipush 34
      // 113: lload 10
      // 115: dup2_x1
      // 116: pop2
      // 117: invokespecial rip/breeze/client/RotationUtil9.buildString_3 (JC)Ljava/lang/String;
      // 11a: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 11d: lload 1
      // 11e: lconst_0
      // 11f: lcmp
      // 120: ifle 1b0
      // 123: aload 15
      // 125: ifnull 1a1
      // 128: iload 14
      // 12a: bipush 10
      // 12c: lload 1
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: iflt 162
      // 132: if_icmpne 158
      // 135: goto 13c
      // 138: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: aload 0
      // 13d: aload 0
      // 13e: lload 12
      // 140: invokespecial rip/breeze/client/RotationUtil9.clamp (J)Ljava/lang/String;
      // 143: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 146: lload 1
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 1b0
      // 14c: aload 15
      // 14e: ifnull 1a1
      // 151: goto 158
      // 154: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: lload 1
      // 159: lconst_0
      // 15a: lcmp
      // 15b: iflt 1b0
      // 15e: iload 14
      // 160: bipush 11
      // 162: if_icmpeq 1a1
      // 165: goto 16c
      // 168: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: new java/lang/IllegalStateException
      // 16f: dup
      // 170: new java/lang/StringBuilder
      // 173: dup
      // 174: invokespecial java/lang/StringBuilder.<init> ()V
      // 177: sipush 17944
      // 17a: ldc2_w 2414740314926802859
      // 17d: lload 1
      // 17e: lxor
      // 17f: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 185: aload 0
      // 186: lload 3
      // 187: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18d: aload 0
      // 18e: lload 5
      // 190: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 199: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 19c: athrow
      // 19d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: sipush 3814
      // 1a5: ldc2_w 1782086350578488501
      // 1a8: lload 1
      // 1a9: lxor
      // 1aa: invokestatic rip/breeze/client/RotationUtil9.decrypt (IJ)I
      // 1ad: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 1b0: aload 0
      // 1b1: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 1b4: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 1b7: dstore 16
      // 1b9: aload 0
      // 1ba: lload 1
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: iflt 227
      // 1c0: getfield rip/breeze/client/RotationUtil9.fieldBool_c Z
      // 1c3: ifne 21c
      // 1c6: dload 16
      // 1c8: invokestatic java/lang/Double.isNaN (D)Z
      // 1cb: ifne 1ea
      // 1ce: goto 1d5
      // 1d1: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: dload 16
      // 1d7: lload 1
      // 1d8: lconst_0
      // 1d9: lcmp
      // 1da: ifle 237
      // 1dd: invokestatic java/lang/Double.isInfinite (D)Z
      // 1e0: ifeq 21c
      // 1e3: goto 1ea
      // 1e6: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: new rip/breeze/client/BreezeException
      // 1ed: dup
      // 1ee: new java/lang/StringBuilder
      // 1f1: dup
      // 1f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f5: sipush 15052
      // 1f8: ldc2_w 883069483831860087
      // 1fb: lload 1
      // 1fc: lxor
      // 1fd: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 200: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 203: dload 16
      // 205: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 208: aload 0
      // 209: lload 5
      // 20b: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 20e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 211: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 214: invokespecial rip/breeze/client/BreezeException.<init> (Ljava/lang/String;)V
      // 217: athrow
      // 218: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: aload 0
      // 21d: aconst_null
      // 21e: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 221: aload 0
      // 222: bipush 0
      // 223: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 226: aload 0
      // 227: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 22a: aload 0
      // 22b: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 22e: bipush 1
      // 22f: isub
      // 230: dup2
      // 231: iaload
      // 232: bipush 1
      // 233: iadd
      // 234: iastore
      // 235: dload 16
      // 237: dreturn
      // try (60 -> 85): 85 java/io/IOException
      // try (87 -> 118): 119 java/io/IOException
      // try (94 -> 128): 129 java/io/IOException
      // try (121 -> 138): 139 java/io/IOException
      // try (131 -> 146): 147 java/io/IOException
      // try (141 -> 151): 151 java/io/IOException
      // try (154 -> 172): 173 java/io/IOException
      // try (165 -> 186): 187 java/io/IOException
      // try (175 -> 196): 197 java/io/IOException
      // try (189 -> 221): 221 java/io/IOException
      // try (234 -> 244): 245 java/io/IOException
      // try (241 -> 254): 255 java/io/IOException
      // try (247 -> 277): 277 java/io/IOException
   }

   public long getLong(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 110165428164245
      // 00b: lxor
      // 00c: lstore 3
      // 00d: dup2
      // 00e: ldc2_w 76146566198064
      // 011: lxor
      // 012: lstore 5
      // 014: dup2
      // 015: ldc2_w 122715639153796
      // 018: lxor
      // 019: dup2
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 7
      // 020: dup2
      // 021: bipush 16
      // 023: lshl
      // 024: bipush 32
      // 026: lushr
      // 027: l2i
      // 028: istore 8
      // 02a: dup2
      // 02b: bipush 48
      // 02d: lshl
      // 02e: bipush 48
      // 030: lushr
      // 031: l2i
      // 032: istore 9
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 137821369891538
      // 039: lxor
      // 03a: lstore 10
      // 03c: dup2
      // 03d: ldc2_w 59625614632286
      // 040: lxor
      // 041: lstore 12
      // 043: pop2
      // 044: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 047: aload 0
      // 048: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 04b: istore 14
      // 04d: astore 15
      // 04f: iload 14
      // 051: ifne 062
      // 054: aload 0
      // 055: iload 7
      // 057: i2c
      // 058: iload 8
      // 05a: iload 9
      // 05c: i2s
      // 05d: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 060: istore 14
      // 062: iload 14
      // 064: bipush 15
      // 066: lload 1
      // 067: lconst_0
      // 068: lcmp
      // 069: iflt 090
      // 06c: if_icmpne 08c
      // 06f: aload 0
      // 070: bipush 0
      // 071: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 074: aload 0
      // 075: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 078: aload 0
      // 079: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 07c: bipush 1
      // 07d: isub
      // 07e: dup2
      // 07f: iaload
      // 080: bipush 1
      // 081: iadd
      // 082: iastore
      // 083: aload 0
      // 084: getfield rip/breeze/client/RotationUtil9.fieldLong_j J
      // 087: lreturn
      // 088: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: iload 14
      // 08e: bipush 16
      // 090: lload 1
      // 091: lconst_0
      // 092: lcmp
      // 093: iflt 0d3
      // 096: if_icmpne 0cf
      // 099: aload 0
      // 09a: new java/lang/String
      // 09d: dup
      // 09e: aload 0
      // 09f: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 0a2: aload 0
      // 0a3: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0a6: aload 0
      // 0a7: getfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 0aa: invokespecial java/lang/String.<init> ([CII)V
      // 0ad: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 0b0: aload 0
      // 0b1: dup
      // 0b2: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0b5: aload 0
      // 0b6: getfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 0b9: iadd
      // 0ba: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0bd: lload 1
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 1cb
      // 0c3: aload 15
      // 0c5: ifnull 1bc
      // 0c8: goto 0cf
      // 0cb: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: iload 14
      // 0d1: bipush 8
      // 0d3: lload 1
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 10f
      // 0d9: if_icmpeq 105
      // 0dc: goto 0e3
      // 0df: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: iload 14
      // 0e5: bipush 9
      // 0e7: lload 1
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 10f
      // 0ed: if_icmpeq 105
      // 0f0: goto 0f7
      // 0f3: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: iload 14
      // 0f9: bipush 10
      // 0fb: if_icmpne 187
      // 0fe: goto 105
      // 101: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: lload 1
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 135
      // 10b: iload 14
      // 10d: bipush 10
      // 10f: if_icmpne 135
      // 112: goto 119
      // 115: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: aload 0
      // 11a: lload 1
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 15b
      // 120: aload 0
      // 121: lload 12
      // 123: invokespecial rip/breeze/client/RotationUtil9.clamp (J)Ljava/lang/String;
      // 126: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 129: aload 15
      // 12b: ifnull 15a
      // 12e: goto 135
      // 131: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 0
      // 136: aload 0
      // 137: iload 14
      // 139: bipush 8
      // 13b: if_icmpne 14e
      // 13e: goto 145
      // 141: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: bipush 39
      // 147: goto 150
      // 14a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: bipush 34
      // 150: lload 10
      // 152: dup2_x1
      // 153: pop2
      // 154: invokespecial rip/breeze/client/RotationUtil9.buildString_3 (JC)Ljava/lang/String;
      // 157: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 15a: aload 0
      // 15b: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 15e: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 161: lstore 16
      // 163: aload 0
      // 164: bipush 0
      // 165: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 168: aload 0
      // 169: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 16c: aload 0
      // 16d: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 170: bipush 1
      // 171: isub
      // 172: dup2
      // 173: iaload
      // 174: bipush 1
      // 175: iadd
      // 176: iastore
      // 177: lload 16
      // 179: lreturn
      // 17a: astore 18
      // 17c: lload 1
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: iflt 1cb
      // 182: aload 15
      // 184: ifnull 1bc
      // 187: new java/lang/IllegalStateException
      // 18a: dup
      // 18b: new java/lang/StringBuilder
      // 18e: dup
      // 18f: invokespecial java/lang/StringBuilder.<init> ()V
      // 192: sipush 15226
      // 195: ldc2_w 8383913179661696947
      // 198: lload 1
      // 199: lxor
      // 19a: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: aload 0
      // 1a1: lload 3
      // 1a2: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a8: aload 0
      // 1a9: lload 5
      // 1ab: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 1ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b4: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 1b7: athrow
      // 1b8: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bb: athrow
      // 1bc: aload 0
      // 1bd: sipush 20892
      // 1c0: ldc2_w 8741785303614140084
      // 1c3: lload 1
      // 1c4: lxor
      // 1c5: invokestatic rip/breeze/client/RotationUtil9.decrypt (IJ)I
      // 1c8: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 1cb: aload 0
      // 1cc: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 1cf: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 1d2: dstore 16
      // 1d4: dload 16
      // 1d6: d2l
      // 1d7: lstore 19
      // 1d9: lload 19
      // 1db: lload 1
      // 1dc: lconst_0
      // 1dd: lcmp
      // 1de: ifle 237
      // 1e1: l2d
      // 1e2: dload 16
      // 1e4: dcmpl
      // 1e5: ifeq 21c
      // 1e8: new java/lang/NumberFormatException
      // 1eb: dup
      // 1ec: new java/lang/StringBuilder
      // 1ef: dup
      // 1f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f3: sipush 24774
      // 1f6: ldc2_w 5000144005099758618
      // 1f9: lload 1
      // 1fa: lxor
      // 1fb: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 1fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 201: aload 0
      // 202: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 205: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 208: aload 0
      // 209: lload 5
      // 20b: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 20e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 211: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 214: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 217: athrow
      // 218: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: aload 0
      // 21d: aconst_null
      // 21e: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 221: aload 0
      // 222: bipush 0
      // 223: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 226: aload 0
      // 227: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 22a: aload 0
      // 22b: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 22e: bipush 1
      // 22f: isub
      // 230: dup2
      // 231: iaload
      // 232: bipush 1
      // 233: iadd
      // 234: iastore
      // 235: lload 19
      // 237: lreturn
      // try (170 -> 180): 180 java/lang/NumberFormatException
      // try (156 -> 175): 176 java/lang/NumberFormatException
      // try (146 -> 167): 168 java/lang/NumberFormatException
      // try (140 -> 153): 154 java/lang/NumberFormatException
      // try (130 -> 143): 144 java/lang/NumberFormatException
      // try (120 -> 137): 138 java/lang/NumberFormatException
      // try (93 -> 127): 128 java/lang/NumberFormatException
      // try (86 -> 117): 118 java/lang/NumberFormatException
      // try (60 -> 84): 84 java/lang/NumberFormatException
      // try (188 -> 207): 208 java/lang/NumberFormatException
      // try (209 -> 237): 237 java/lang/NumberFormatException
      // try (253 -> 283): 283 java/lang/NumberFormatException
   }

   private String buildString_3(long param1, char param3) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 22864366470699
      // 00b: lxor
      // 00c: lstore 4
      // 00e: dup2
      // 00f: ldc2_w 10243410375679
      // 012: lxor
      // 013: dup2
      // 014: bipush 32
      // 016: lushr
      // 017: l2i
      // 018: istore 6
      // 01a: dup2
      // 01b: bipush 32
      // 01d: lshl
      // 01e: bipush 32
      // 020: lushr
      // 021: l2i
      // 022: istore 7
      // 024: pop2
      // 025: dup2
      // 026: ldc2_w 98296426683793
      // 029: lxor
      // 02a: lstore 8
      // 02c: pop2
      // 02d: aload 0
      // 02e: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 031: astore 10
      // 033: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 036: aconst_null
      // 037: astore 11
      // 039: astore 12
      // 03b: aload 0
      // 03c: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 03f: istore 13
      // 041: aload 0
      // 042: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 045: istore 14
      // 047: iload 13
      // 049: istore 15
      // 04b: iload 13
      // 04d: iload 14
      // 04f: if_icmpge 144
      // 052: aload 10
      // 054: iload 13
      // 056: iinc 13 1
      // 059: caload
      // 05a: istore 16
      // 05c: iload 16
      // 05e: iload 3
      // 05f: lload 1
      // 060: lconst_0
      // 061: lcmp
      // 062: iflt 0aa
      // 065: if_icmpne 0a6
      // 068: aload 0
      // 069: iload 13
      // 06b: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 06e: iload 13
      // 070: iload 15
      // 072: isub
      // 073: bipush 1
      // 074: isub
      // 075: istore 17
      // 077: aload 11
      // 079: lload 1
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 0a2
      // 07f: ifnonnull 094
      // 082: new java/lang/String
      // 085: dup
      // 086: aload 10
      // 088: iload 15
      // 08a: iload 17
      // 08c: invokespecial java/lang/String.<init> ([CII)V
      // 08f: areturn
      // 090: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 11
      // 096: aload 10
      // 098: iload 15
      // 09a: iload 17
      // 09c: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 09f: pop
      // 0a0: aload 11
      // 0a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a5: areturn
      // 0a6: iload 16
      // 0a8: bipush 92
      // 0aa: lload 1
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 11e
      // 0b0: if_icmpne 11a
      // 0b3: aload 0
      // 0b4: iload 13
      // 0b6: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0b9: iload 13
      // 0bb: iload 15
      // 0bd: isub
      // 0be: bipush 1
      // 0bf: isub
      // 0c0: istore 17
      // 0c2: aload 11
      // 0c4: lload 1
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: iflt 0fe
      // 0ca: ifnonnull 0e5
      // 0cd: iload 17
      // 0cf: bipush 1
      // 0d0: iadd
      // 0d1: bipush 2
      // 0d2: imul
      // 0d3: istore 18
      // 0d5: new java/lang/StringBuilder
      // 0d8: dup
      // 0d9: iload 18
      // 0db: bipush 16
      // 0dd: invokestatic java/lang/Math.max (II)I
      // 0e0: invokespecial java/lang/StringBuilder.<init> (I)V
      // 0e3: astore 11
      // 0e5: aload 11
      // 0e7: aload 10
      // 0e9: iload 15
      // 0eb: iload 17
      // 0ed: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 0f0: pop
      // 0f1: aload 11
      // 0f3: aload 0
      // 0f4: iload 6
      // 0f6: iload 7
      // 0f8: invokespecial rip/breeze/client/RotationUtil9.getChar (II)C
      // 0fb: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0fe: pop
      // 0ff: aload 0
      // 100: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 103: istore 13
      // 105: aload 0
      // 106: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 109: istore 14
      // 10b: iload 13
      // 10d: istore 15
      // 10f: aload 12
      // 111: lload 1
      // 112: lconst_0
      // 113: lcmp
      // 114: iflt 141
      // 117: ifnull 13f
      // 11a: iload 16
      // 11c: bipush 10
      // 11e: if_icmpne 13f
      // 121: goto 128
      // 124: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 0
      // 129: dup
      // 12a: getfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 12d: bipush 1
      // 12e: iadd
      // 12f: putfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 132: aload 0
      // 133: iload 13
      // 135: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 138: goto 13f
      // 13b: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: aload 12
      // 141: ifnull 04b
      // 144: aload 11
      // 146: lload 1
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 176
      // 14c: ifnonnull 168
      // 14f: iload 13
      // 151: iload 15
      // 153: isub
      // 154: bipush 2
      // 155: imul
      // 156: istore 16
      // 158: new java/lang/StringBuilder
      // 15b: dup
      // 15c: iload 16
      // 15e: bipush 16
      // 160: invokestatic java/lang/Math.max (II)I
      // 163: invokespecial java/lang/StringBuilder.<init> (I)V
      // 166: astore 11
      // 168: aload 11
      // 16a: aload 10
      // 16c: iload 15
      // 16e: iload 13
      // 170: iload 15
      // 172: isub
      // 173: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 176: pop
      // 177: aload 0
      // 178: iload 13
      // 17a: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 17d: aload 0
      // 17e: lload 1
      // 17f: lconst_0
      // 180: lcmp
      // 181: iflt 18e
      // 184: bipush 1
      // 185: lload 4
      // 187: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 18a: ifne 1a3
      // 18d: aload 0
      // 18e: lload 8
      // 190: sipush 10268
      // 193: ldc2_w 2091071445608119684
      // 196: lload 1
      // 197: lxor
      // 198: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 19b: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 19e: athrow
      // 19f: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: goto 03b
      // try (69 -> 82): 82 java/io/IOException
      // try (149 -> 158): 159 java/io/IOException
      // try (155 -> 170): 171 java/io/IOException
      // try (194 -> 223): 223 java/io/IOException
   }

   private String clamp(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 105175766145447
      // 00b: lxor
      // 00c: lstore 3
      // 00d: dup2
      // 00e: ldc2_w 18242957439197
      // 011: lxor
      // 012: lstore 5
      // 014: pop2
      // 015: aconst_null
      // 016: astore 7
      // 018: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 01b: bipush 0
      // 01c: istore 8
      // 01e: astore 9
      // 020: aload 0
      // 021: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 024: iload 8
      // 026: iadd
      // 027: aload 0
      // 028: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 02b: if_icmpge 0f3
      // 02e: lload 1
      // 02f: lconst_0
      // 030: lcmp
      // 031: ifle 0e7
      // 034: aload 0
      // 035: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 038: aload 0
      // 039: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 03c: iload 8
      // 03e: iadd
      // 03f: caload
      // 040: lookupswitch 164 16 9 153 10 153 12 153 13 153 32 153 35 140 44 153 47 140 58 153 59 140 61 140 91 153 92 140 93 153 123 153 125 153
      // 0cc: aload 0
      // 0cd: lload 5
      // 0cf: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 0d2: goto 0d9
      // 0d5: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: lload 1
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 173
      // 0df: aload 9
      // 0e1: ifnull 173
      // 0e4: iinc 8 1
      // 0e7: aload 9
      // 0e9: ifnull 020
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: iload 8
      // 0f5: lload 1
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: iflt 112
      // 0fb: aload 0
      // 0fc: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 0ff: arraylength
      // 100: if_icmpge 128
      // 103: lload 1
      // 104: lconst_0
      // 105: lcmp
      // 106: ifle 173
      // 109: aload 0
      // 10a: iload 8
      // 10c: bipush 1
      // 10d: iadd
      // 10e: lload 3
      // 10f: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 112: ifeq 173
      // 115: goto 11c
      // 118: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aload 9
      // 11e: ifnull 020
      // 121: goto 128
      // 124: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 7
      // 12a: lload 1
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: ifle 152
      // 130: ifnonnull 143
      // 133: new java/lang/StringBuilder
      // 136: dup
      // 137: iload 8
      // 139: bipush 16
      // 13b: invokestatic java/lang/Math.max (II)I
      // 13e: invokespecial java/lang/StringBuilder.<init> (I)V
      // 141: astore 7
      // 143: aload 7
      // 145: aload 0
      // 146: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 149: aload 0
      // 14a: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 14d: iload 8
      // 14f: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 152: pop
      // 153: aload 0
      // 154: dup
      // 155: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 158: iload 8
      // 15a: iadd
      // 15b: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 15e: bipush 0
      // 15f: istore 8
      // 161: aload 0
      // 162: bipush 1
      // 163: lload 3
      // 164: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 167: ifne 020
      // 16a: lload 1
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: iflt 02e
      // 170: goto 173
      // 173: aconst_null
      // 174: aload 7
      // 176: if_acmpne 191
      // 179: new java/lang/String
      // 17c: dup
      // 17d: aload 0
      // 17e: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 181: aload 0
      // 182: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 185: iload 8
      // 187: invokespecial java/lang/String.<init> ([CII)V
      // 18a: goto 1a3
      // 18d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 190: athrow
      // 191: aload 7
      // 193: aload 0
      // 194: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 197: aload 0
      // 198: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 19b: iload 8
      // 19d: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 1a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a3: astore 10
      // 1a5: aload 0
      // 1a6: dup
      // 1a7: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1aa: iload 8
      // 1ac: iadd
      // 1ad: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1b0: aload 10
      // 1b2: areturn
      // try (27 -> 42): 43 java/io/IOException
      // try (45 -> 54): 55 java/io/IOException
      // try (57 -> 77): 78 java/io/IOException
      // try (66 -> 82): 83 java/io/IOException
      // try (124 -> 136): 136 java/io/IOException
   }

   public int calculate_8(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 131579428316594
      // 00b: lxor
      // 00c: lstore 3
      // 00d: dup2
      // 00e: ldc2_w 95499053203479
      // 011: lxor
      // 012: lstore 5
      // 014: dup2
      // 015: ldc2_w 136346626127779
      // 018: lxor
      // 019: dup2
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 7
      // 020: dup2
      // 021: bipush 16
      // 023: lshl
      // 024: bipush 32
      // 026: lushr
      // 027: l2i
      // 028: istore 8
      // 02a: dup2
      // 02b: bipush 48
      // 02d: lshl
      // 02e: bipush 48
      // 030: lushr
      // 031: l2i
      // 032: istore 9
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 121785205426677
      // 039: lxor
      // 03a: lstore 10
      // 03c: dup2
      // 03d: ldc2_w 41373180335737
      // 040: lxor
      // 041: lstore 12
      // 043: pop2
      // 044: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 047: aload 0
      // 048: getfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 04b: istore 14
      // 04d: astore 15
      // 04f: iload 14
      // 051: ifne 062
      // 054: aload 0
      // 055: iload 7
      // 057: i2c
      // 058: iload 8
      // 05a: iload 9
      // 05c: i2s
      // 05d: invokevirtual rip/breeze/client/RotationUtil9.calculate_4 (CIS)I
      // 060: istore 14
      // 062: iload 14
      // 064: bipush 15
      // 066: lload 1
      // 067: lconst_0
      // 068: lcmp
      // 069: ifle 0d6
      // 06c: if_icmpne 0d2
      // 06f: aload 0
      // 070: getfield rip/breeze/client/RotationUtil9.fieldLong_j J
      // 073: l2i
      // 074: istore 16
      // 076: aload 0
      // 077: getfield rip/breeze/client/RotationUtil9.fieldLong_j J
      // 07a: iload 16
      // 07c: i2l
      // 07d: lcmp
      // 07e: lload 1
      // 07f: lconst_0
      // 080: lcmp
      // 081: ifle 0d1
      // 084: ifeq 0bb
      // 087: new java/lang/NumberFormatException
      // 08a: dup
      // 08b: new java/lang/StringBuilder
      // 08e: dup
      // 08f: invokespecial java/lang/StringBuilder.<init> ()V
      // 092: sipush 32255
      // 095: ldc2_w 6980165050193234432
      // 098: lload 1
      // 099: lxor
      // 09a: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: aload 0
      // 0a1: getfield rip/breeze/client/RotationUtil9.fieldLong_j J
      // 0a4: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0a7: aload 0
      // 0a8: lload 5
      // 0aa: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b3: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 0b6: athrow
      // 0b7: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: bipush 0
      // 0bd: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 0c0: aload 0
      // 0c1: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 0c4: aload 0
      // 0c5: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 0c8: bipush 1
      // 0c9: isub
      // 0ca: dup2
      // 0cb: iaload
      // 0cc: bipush 1
      // 0cd: iadd
      // 0ce: iastore
      // 0cf: iload 16
      // 0d1: ireturn
      // 0d2: iload 14
      // 0d4: bipush 16
      // 0d6: lload 1
      // 0d7: lconst_0
      // 0d8: lcmp
      // 0d9: ifle 119
      // 0dc: if_icmpne 115
      // 0df: aload 0
      // 0e0: new java/lang/String
      // 0e3: dup
      // 0e4: aload 0
      // 0e5: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 0e8: aload 0
      // 0e9: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0ec: aload 0
      // 0ed: getfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 0f0: invokespecial java/lang/String.<init> ([CII)V
      // 0f3: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 0f6: aload 0
      // 0f7: dup
      // 0f8: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0fb: aload 0
      // 0fc: getfield rip/breeze/client/RotationUtil9.fieldInt_k I
      // 0ff: iadd
      // 100: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 103: lload 1
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 211
      // 109: aload 15
      // 10b: ifnull 202
      // 10e: goto 115
      // 111: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: iload 14
      // 117: bipush 8
      // 119: lload 1
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 155
      // 11f: if_icmpeq 14b
      // 122: goto 129
      // 125: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: iload 14
      // 12b: bipush 9
      // 12d: lload 1
      // 12e: lconst_0
      // 12f: lcmp
      // 130: ifle 155
      // 133: if_icmpeq 14b
      // 136: goto 13d
      // 139: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: iload 14
      // 13f: bipush 10
      // 141: if_icmpne 1cd
      // 144: goto 14b
      // 147: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: lload 1
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 17b
      // 151: iload 14
      // 153: bipush 10
      // 155: if_icmpne 17b
      // 158: goto 15f
      // 15b: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: aload 0
      // 160: lload 1
      // 161: lconst_0
      // 162: lcmp
      // 163: iflt 1a1
      // 166: aload 0
      // 167: lload 12
      // 169: invokespecial rip/breeze/client/RotationUtil9.clamp (J)Ljava/lang/String;
      // 16c: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 16f: aload 15
      // 171: ifnull 1a0
      // 174: goto 17b
      // 177: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a: athrow
      // 17b: aload 0
      // 17c: aload 0
      // 17d: iload 14
      // 17f: bipush 8
      // 181: if_icmpne 194
      // 184: goto 18b
      // 187: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: bipush 39
      // 18d: goto 196
      // 190: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: bipush 34
      // 196: lload 10
      // 198: dup2_x1
      // 199: pop2
      // 19a: invokespecial rip/breeze/client/RotationUtil9.buildString_3 (JC)Ljava/lang/String;
      // 19d: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 1a0: aload 0
      // 1a1: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 1a4: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1a7: istore 16
      // 1a9: aload 0
      // 1aa: bipush 0
      // 1ab: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 1ae: aload 0
      // 1af: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 1b2: aload 0
      // 1b3: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 1b6: bipush 1
      // 1b7: isub
      // 1b8: dup2
      // 1b9: iaload
      // 1ba: bipush 1
      // 1bb: iadd
      // 1bc: iastore
      // 1bd: iload 16
      // 1bf: ireturn
      // 1c0: astore 17
      // 1c2: lload 1
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: iflt 211
      // 1c8: aload 15
      // 1ca: ifnull 202
      // 1cd: new java/lang/IllegalStateException
      // 1d0: dup
      // 1d1: new java/lang/StringBuilder
      // 1d4: dup
      // 1d5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d8: sipush 15584
      // 1db: ldc2_w 1841352213902527277
      // 1de: lload 1
      // 1df: lxor
      // 1e0: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: aload 0
      // 1e7: lload 3
      // 1e8: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 1eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1ee: aload 0
      // 1ef: lload 5
      // 1f1: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fa: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 1fd: athrow
      // 1fe: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 0
      // 203: sipush 20892
      // 206: ldc2_w 8741800171882765715
      // 209: lload 1
      // 20a: lxor
      // 20b: invokestatic rip/breeze/client/RotationUtil9.decrypt (IJ)I
      // 20e: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 211: aload 0
      // 212: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 215: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 218: dstore 18
      // 21a: dload 18
      // 21c: d2i
      // 21d: istore 16
      // 21f: iload 16
      // 221: i2d
      // 222: dload 18
      // 224: dcmpl
      // 225: lload 1
      // 226: lconst_0
      // 227: lcmp
      // 228: iflt 27d
      // 22b: ifeq 262
      // 22e: new java/lang/NumberFormatException
      // 231: dup
      // 232: new java/lang/StringBuilder
      // 235: dup
      // 236: invokespecial java/lang/StringBuilder.<init> ()V
      // 239: sipush 15584
      // 23c: ldc2_w 1841352213902527277
      // 23f: lload 1
      // 240: lxor
      // 241: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 244: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 247: aload 0
      // 248: getfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 24b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24e: aload 0
      // 24f: lload 5
      // 251: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 254: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 257: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25a: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 25d: athrow
      // 25e: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: aload 0
      // 263: aconst_null
      // 264: putfield rip/breeze/client/RotationUtil9.string_l Ljava/lang/String;
      // 267: aload 0
      // 268: bipush 0
      // 269: putfield rip/breeze/client/RotationUtil9.fieldInt_i I
      // 26c: aload 0
      // 26d: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 270: aload 0
      // 271: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 274: bipush 1
      // 275: isub
      // 276: dup2
      // 277: iaload
      // 278: bipush 1
      // 279: iadd
      // 27a: iastore
      // 27b: iload 16
      // 27d: ireturn
      // try (204 -> 214): 214 java/lang/NumberFormatException
      // try (190 -> 209): 210 java/lang/NumberFormatException
      // try (180 -> 201): 202 java/lang/NumberFormatException
      // try (174 -> 187): 188 java/lang/NumberFormatException
      // try (164 -> 177): 178 java/lang/NumberFormatException
      // try (154 -> 171): 172 java/lang/NumberFormatException
      // try (127 -> 161): 162 java/lang/NumberFormatException
      // try (120 -> 151): 152 java/lang/NumberFormatException
      // try (71 -> 102): 102 java/lang/NumberFormatException
      // try (222 -> 241): 242 java/lang/NumberFormatException
      // try (243 -> 271): 271 java/lang/NumberFormatException
      // try (287 -> 317): 317 java/lang/NumberFormatException
   }

   @Override
   public void close() throws IOException {
      this.fieldInt_i = 0;
      this.arr_m[0] = 8;
      this.fieldInt_n = 1;
      this.reader_b.close();
   }

   private void calculate_9(int var1, long var2) {
      var2 = 118242208525211L ^ var2;
      if (this.fieldInt_n == this.arr_m.length) {
         int[] var4 = new int[this.fieldInt_n * 2];
         int[] var5 = new int[this.fieldInt_n * 2];
         String[] var6 = new String[this.fieldInt_n * 2];
         System.arraycopy(this.arr_m, 0, var4, 0, this.fieldInt_n);
         System.arraycopy(this.arr_p, 0, var5, 0, this.fieldInt_n);
         System.arraycopy(this.arr_o, 0, var6, 0, this.fieldInt_n);
         this.arr_m = var4;
         this.arr_p = var5;
         this.arr_o = var6;
      }

      this.arr_m[this.fieldInt_n++] = var1;
   }

   private boolean checkCondition_3(int param1, long param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 009: aload 0
      // 00a: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 00d: astore 4
      // 00f: aload 0
      // 010: dup
      // 011: getfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 014: aload 0
      // 015: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 018: isub
      // 019: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 01c: astore 5
      // 01e: aload 0
      // 01f: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 022: aload 0
      // 023: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 026: if_icmpeq 058
      // 029: aload 0
      // 02a: dup
      // 02b: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 02e: aload 0
      // 02f: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 032: isub
      // 033: lload 2
      // 034: lconst_0
      // 035: lcmp
      // 036: iflt 066
      // 039: putfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 03c: aload 4
      // 03e: aload 0
      // 03f: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 042: aload 4
      // 044: bipush 0
      // 045: aload 0
      // 046: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 049: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 04c: aload 5
      // 04e: ifnull 064
      // 051: goto 058
      // 054: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 0
      // 059: bipush 0
      // 05a: putfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 05d: goto 064
      // 060: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 0
      // 065: bipush 0
      // 066: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 069: aload 0
      // 06a: getfield rip/breeze/client/RotationUtil9.reader_b Ljava/io/Reader;
      // 06d: aload 4
      // 06f: aload 0
      // 070: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 073: aload 4
      // 075: arraylength
      // 076: aload 0
      // 077: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 07a: isub
      // 07b: invokevirtual java/io/Reader.read ([CII)I
      // 07e: dup
      // 07f: istore 6
      // 081: bipush -1
      // 082: if_icmpeq 112
      // 085: aload 0
      // 086: dup
      // 087: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 08a: iload 6
      // 08c: iadd
      // 08d: putfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 090: aload 0
      // 091: getfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 106
      // 09a: ifne 102
      // 09d: aload 0
      // 09e: getfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 0a1: lload 2
      // 0a2: lconst_0
      // 0a3: lcmp
      // 0a4: ifle 106
      // 0a7: ifne 102
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: iflt 106
      // 0bb: ifle 102
      // 0be: goto 0c5
      // 0c1: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 4
      // 0c7: bipush 0
      // 0c8: caload
      // 0c9: sipush 28301
      // 0cc: ldc2_w 4933533176190004574
      // 0cf: lload 2
      // 0d0: lxor
      // 0d1: invokestatic rip/breeze/client/RotationUtil9.decrypt (IJ)I
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: ifle 107
      // 0da: if_icmpne 102
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: dup
      // 0e6: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0e9: bipush 1
      // 0ea: iadd
      // 0eb: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0ee: aload 0
      // 0ef: dup
      // 0f0: getfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 0f3: bipush 1
      // 0f4: iadd
      // 0f5: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 0f8: iinc 1 1
      // 0fb: goto 102
      // 0fe: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: aload 0
      // 103: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 106: iload 1
      // 107: if_icmplt 069
      // 10a: bipush 1
      // 10b: lload 2
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 094
      // 111: ireturn
      // 112: bipush 0
      // 113: ireturn
      // try (16 -> 42): 43 java/io/IOException
      // try (21 -> 48): 49 java/io/IOException
      // try (69 -> 89): 90 java/io/IOException
      // try (82 -> 99): 100 java/io/IOException
      // try (92 -> 115): 116 java/io/IOException
      // try (102 -> 131): 132 java/io/IOException
   }

   private int calculate_10(byte param1, long param2, boolean param4) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 56
      // 004: lshl
      // 005: lload 2
      // 006: bipush 8
      // 008: lshl
      // 009: bipush 8
      // 00b: lushr
      // 00c: lor
      // 00d: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 010: lxor
      // 011: lstore 5
      // 013: lload 5
      // 015: dup2
      // 016: ldc2_w 28471818997482
      // 019: lxor
      // 01a: lstore 7
      // 01c: dup2
      // 01d: ldc2_w 34497038362466
      // 020: lxor
      // 021: lstore 9
      // 023: dup2
      // 024: ldc2_w 106236128541311
      // 027: lxor
      // 028: lstore 11
      // 02a: dup2
      // 02b: ldc2_w 43734055984685
      // 02e: lxor
      // 02f: lstore 13
      // 031: dup2
      // 032: ldc2_w 115418657093463
      // 035: lxor
      // 036: lstore 15
      // 038: dup2
      // 039: ldc2_w 117009089447319
      // 03c: lxor
      // 03d: lstore 17
      // 03f: pop2
      // 040: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 043: aload 0
      // 044: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 047: astore 19
      // 049: astore 20
      // 04b: aload 0
      // 04c: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 04f: istore 21
      // 051: aload 0
      // 052: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 055: istore 22
      // 057: iload 21
      // 059: iload 22
      // 05b: if_icmpne 08c
      // 05e: aload 0
      // 05f: iload 21
      // 061: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 064: aload 0
      // 065: bipush 1
      // 066: lload 13
      // 068: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 06b: lload 2
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 08a
      // 071: ifne 080
      // 074: aload 20
      // 076: ifnull 238
      // 079: goto 080
      // 07c: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 0
      // 081: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 084: istore 21
      // 086: aload 0
      // 087: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 08a: istore 22
      // 08c: aload 19
      // 08e: iload 21
      // 090: iinc 21 1
      // 093: caload
      // 094: istore 23
      // 096: iload 23
      // 098: bipush 10
      // 09a: lload 2
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: ifle 0c3
      // 0a0: if_icmpne 0bf
      // 0a3: aload 0
      // 0a4: dup
      // 0a5: getfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 0a8: bipush 1
      // 0a9: iadd
      // 0aa: putfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 0ad: aload 0
      // 0ae: iload 21
      // 0b0: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 0b3: aload 20
      // 0b5: ifnull 057
      // 0b8: goto 0bf
      // 0bb: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 23
      // 0c1: bipush 32
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0d0
      // 0c9: if_icmpeq 057
      // 0cc: iload 23
      // 0ce: bipush 13
      // 0d0: lload 2
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: iflt 0dd
      // 0d6: if_icmpeq 057
      // 0d9: iload 23
      // 0db: bipush 9
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 0f6
      // 0e3: if_icmpne 0f2
      // 0e6: aload 20
      // 0e8: ifnull 057
      // 0eb: goto 0f2
      // 0ee: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: iload 23
      // 0f4: bipush 47
      // 0f6: iload 1
      // 0f7: iflt 1fc
      // 0fa: if_icmpne 1f4
      // 0fd: aload 0
      // 0fe: iload 21
      // 100: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 103: iload 21
      // 105: lload 2
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 151
      // 10b: iload 22
      // 10d: if_icmpne 144
      // 110: goto 117
      // 113: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: aload 0
      // 118: dup
      // 119: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 11c: bipush 1
      // 11d: isub
      // 11e: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 121: aload 0
      // 122: bipush 2
      // 123: lload 13
      // 125: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 128: istore 24
      // 12a: aload 0
      // 12b: dup
      // 12c: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 12f: bipush 1
      // 130: iadd
      // 131: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 134: iload 24
      // 136: iload 1
      // 137: iflt 155
      // 13a: ifne 144
      // 13d: iload 23
      // 13f: ireturn
      // 140: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 0
      // 145: lload 15
      // 147: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 14a: aload 19
      // 14c: aload 0
      // 14d: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 150: caload
      // 151: istore 24
      // 153: iload 24
      // 155: iload 1
      // 156: iflt 1f3
      // 159: lookupswitch 148 2 42 27 47 115
      // 174: aload 0
      // 175: dup
      // 176: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 179: bipush 1
      // 17a: iadd
      // 17b: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 17e: aload 0
      // 17f: lload 9
      // 181: sipush 8626
      // 184: ldc2_w 158856869974060070
      // 187: lload 5
      // 189: lxor
      // 18a: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 18d: invokespecial rip/breeze/client/RotationUtil9.checkCondition_4 (JLjava/lang/String;)Z
      // 190: iload 1
      // 191: iflt 1c1
      // 194: ifne 1b5
      // 197: goto 19e
      // 19a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: aload 0
      // 19f: lload 17
      // 1a1: sipush 3906
      // 1a4: ldc2_w 4547576897291289303
      // 1a7: lload 5
      // 1a9: lxor
      // 1aa: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 1ad: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 1b0: athrow
      // 1b1: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1b9: bipush 2
      // 1ba: iadd
      // 1bb: istore 21
      // 1bd: aload 0
      // 1be: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 1c1: istore 22
      // 1c3: aload 20
      // 1c5: iload 1
      // 1c6: iflt 1ea
      // 1c9: ifnull 057
      // 1cc: aload 0
      // 1cd: dup
      // 1ce: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1d1: bipush 1
      // 1d2: iadd
      // 1d3: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1d6: aload 0
      // 1d7: lload 7
      // 1d9: invokespecial rip/breeze/client/RotationUtil9.calculate_11 (J)V
      // 1dc: aload 0
      // 1dd: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1e0: istore 21
      // 1e2: aload 0
      // 1e3: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 1e6: istore 22
      // 1e8: aload 20
      // 1ea: ifnull 057
      // 1ed: iload 23
      // 1ef: iload 1
      // 1f0: iflt 06b
      // 1f3: ireturn
      // 1f4: iload 23
      // 1f6: iload 1
      // 1f7: iflt 22e
      // 1fa: bipush 35
      // 1fc: if_icmpne 226
      // 1ff: aload 0
      // 200: iload 21
      // 202: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 205: aload 0
      // 206: lload 15
      // 208: invokespecial rip/breeze/client/RotationUtil9.setKey (J)V
      // 20b: aload 0
      // 20c: lload 7
      // 20e: invokespecial rip/breeze/client/RotationUtil9.calculate_11 (J)V
      // 211: aload 0
      // 212: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 215: istore 21
      // 217: aload 0
      // 218: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 21b: istore 22
      // 21d: aload 20
      // 21f: iload 1
      // 220: iflt 235
      // 223: ifnull 233
      // 226: aload 0
      // 227: iload 21
      // 229: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 22c: iload 23
      // 22e: ireturn
      // 22f: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 232: athrow
      // 233: aload 20
      // 235: ifnull 057
      // 238: iload 4
      // 23a: lload 2
      // 23b: lconst_0
      // 23c: lcmp
      // 23d: ifle 272
      // 240: ifeq 271
      // 243: new java/io/EOFException
      // 246: dup
      // 247: new java/lang/StringBuilder
      // 24a: dup
      // 24b: invokespecial java/lang/StringBuilder.<init> ()V
      // 24e: sipush 26920
      // 251: ldc2_w 1676147460249117863
      // 254: lload 5
      // 256: lxor
      // 257: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 25a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25d: aload 0
      // 25e: lload 11
      // 260: invokevirtual rip/breeze/client/RotationUtil9.buildString_4 (J)Ljava/lang/String;
      // 263: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 266: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 269: invokespecial java/io/EOFException.<init> (Ljava/lang/String;)V
      // 26c: athrow
      // 26d: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 270: athrow
      // 271: bipush -1
      // 272: ireturn
      // try (53 -> 67): 68 java/io/IOException
      // try (81 -> 99): 100 java/io/IOException
      // try (116 -> 125): 126 java/io/IOException
      // try (128 -> 143): 144 java/io/IOException
      // try (157 -> 169): 169 java/io/IOException
      // try (179 -> 200): 201 java/io/IOException
      // try (183 -> 212): 212 java/io/IOException
      // try (267 -> 276): 276 java/io/IOException
      // try (280 -> 304): 304 java/io/IOException
   }

   private void setKey(long var1) throws IOException {
      var1 = 118242208525211L ^ var1;
      long var3 = var1 ^ 115552436492635L;

      try {
         if (!this.fieldBool_c) {
            throw this.getIOException(var3, buildString_7(4878, 6913987381418869317L ^ var1));
         }
      } catch (IOException var5) {
         throw getException(var5);
      }
   }

   private void calculate_11(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 94187905186652
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 11: astore 5
      // 13: aload 0
      // 14: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 17: aload 0
      // 18: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 1b: if_icmplt 2d
      // 1e: aload 0
      // 1f: bipush 1
      // 20: lload 3
      // 21: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 24: lload 1
      // 25: lconst_0
      // 26: lcmp
      // 27: ifle 3d
      // 2a: ifeq 96
      // 2d: aload 0
      // 2e: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 31: aload 0
      // 32: dup
      // 33: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 36: dup_x1
      // 37: bipush 1
      // 38: iadd
      // 39: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 3c: caload
      // 3d: istore 6
      // 3f: iload 6
      // 41: bipush 10
      // 43: lload 1
      // 44: lconst_0
      // 45: lcmp
      // 46: ifle 6e
      // 49: if_icmpne 6a
      // 4c: aload 0
      // 4d: dup
      // 4e: getfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 51: bipush 1
      // 52: iadd
      // 53: putfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 56: aload 0
      // 57: aload 0
      // 58: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 5b: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 5e: aload 5
      // 60: ifnull 96
      // 63: goto 6a
      // 66: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: iload 6
      // 6c: bipush 13
      // 6e: if_icmpne 84
      // 71: goto 78
      // 74: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: aload 5
      // 7a: ifnull 96
      // 7d: goto 84
      // 80: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 5
      // 86: ifnull 13
      // 89: lload 1
      // 8a: lconst_0
      // 8b: lcmp
      // 8c: iflt 96
      // 8f: goto 96
      // 92: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: return
      // try (37 -> 56): 57 java/io/IOException
      // try (44 -> 62): 63 java/io/IOException
      // try (59 -> 67): 68 java/io/IOException
      // try (65 -> 72): 77 java/io/IOException
   }

   private boolean checkCondition_4(long param1, String param3) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 91342138938068
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 12: aload 3
      // 13: invokevirtual java/lang/String.length ()I
      // 16: istore 6
      // 18: astore 7
      // 1a: aload 0
      // 1b: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 1e: iload 6
      // 20: iadd
      // 21: aload 0
      // 22: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 25: if_icmple 39
      // 28: aload 0
      // 29: iload 6
      // 2b: lload 4
      // 2d: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 30: lload 1
      // 31: lconst_0
      // 32: lcmp
      // 33: ifle de
      // 36: ifeq d7
      // 39: aload 0
      // 3a: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 3d: aload 0
      // 3e: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 41: caload
      // 42: lload 1
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 7b
      // 48: bipush 10
      // 4a: if_icmpne 7a
      // 4d: goto 54
      // 50: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: dup
      // 56: getfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 59: bipush 1
      // 5a: iadd
      // 5b: putfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 5e: aload 0
      // 5f: aload 0
      // 60: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 63: bipush 1
      // 64: iadd
      // 65: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 68: aload 7
      // 6a: lload 1
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: ifle d4
      // 70: ifnull c8
      // 73: goto 7a
      // 76: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: bipush 0
      // 7b: istore 8
      // 7d: iload 8
      // 7f: iload 6
      // 81: if_icmpge c6
      // 84: lload 1
      // 85: lconst_0
      // 86: lcmp
      // 87: ifle b4
      // 8a: aload 0
      // 8b: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 8e: aload 0
      // 8f: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 92: iload 8
      // 94: iadd
      // 95: caload
      // 96: aload 3
      // 97: iload 8
      // 99: invokevirtual java/lang/String.charAt (I)C
      // 9c: if_icmpeq b1
      // 9f: aload 7
      // a1: lload 1
      // a2: lconst_0
      // a3: lcmp
      // a4: iflt d4
      // a7: ifnull c8
      // aa: goto b1
      // ad: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: iinc 8 1
      // b4: aload 7
      // b6: ifnull 7d
      // b9: lload 1
      // ba: lconst_0
      // bb: lcmp
      // bc: iflt 84
      // bf: goto c6
      // c2: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: bipush 1
      // c7: ireturn
      // c8: aload 0
      // c9: dup
      // ca: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // cd: bipush 1
      // ce: iadd
      // cf: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // d2: aload 7
      // d4: ifnull 1a
      // d7: bipush 0
      // d8: lload 1
      // d9: lconst_0
      // da: lcmp
      // db: iflt 30
      // de: ireturn
      // try (22 -> 42): 43 java/io/IOException
      // try (31 -> 63): 64 java/io/IOException
      // try (71 -> 92): 93 java/io/IOException
      // try (86 -> 98): 103 java/io/IOException
   }

   @Override
   public String toString() {
      long var1 = 57191271457838L;
      long var3 = var1 ^ 103381081220270L;
      return this.getClass().getSimpleName() + this.buildString_4(var3);
   }

   String buildString_4(long var1) {
      var1 = 118242208525211L ^ var1;
      long var3 = var1 ^ 14041019412659L;
      int var5 = this.fieldInt_g + 1;
      int var6 = this.fieldInt_e - this.fieldInt_h + 1;
      return buildString_7(5393, 3278084180933183864L ^ var1)
         + var5
         + buildString_7(3745, 3070371144414565062L ^ var1)
         + var6
         + buildString_7(17514, 4425025559277852718L ^ var1)
         + this.buildString_5(var3);
   }

   public String buildString_5(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 09: new java/lang/StringBuilder
      // 0c: dup
      // 0d: invokespecial java/lang/StringBuilder.<init> ()V
      // 10: bipush 36
      // 12: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 15: astore 3
      // 16: bipush 0
      // 17: istore 4
      // 19: astore 5
      // 1b: aload 0
      // 1c: getfield rip/breeze/client/RotationUtil9.fieldInt_n I
      // 1f: istore 6
      // 21: iload 4
      // 23: iload 6
      // 25: if_icmpge c5
      // 28: lload 1
      // 29: lconst_0
      // 2a: lcmp
      // 2b: ifle c0
      // 2e: aload 0
      // 2f: getfield rip/breeze/client/RotationUtil9.arr_m [I
      // 32: iload 4
      // 34: iaload
      // 35: tableswitch 136 1 8 47 47 87 87 87 136 136 136
      // 64: aload 3
      // 65: bipush 91
      // 67: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 6a: aload 0
      // 6b: getfield rip/breeze/client/RotationUtil9.arr_p [I
      // 6e: iload 4
      // 70: iaload
      // 71: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 74: bipush 93
      // 76: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 79: pop
      // 7a: aload 5
      // 7c: lload 1
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: ifle c2
      // 82: ifnull bd
      // 85: goto 8c
      // 88: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: aload 3
      // 8d: bipush 46
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: getfield rip/breeze/client/RotationUtil9.arr_o [Ljava/lang/String;
      // 97: lload 1
      // 98: lconst_0
      // 99: lcmp
      // 9a: iflt c2
      // 9d: iload 4
      // 9f: aaload
      // a0: ifnull bd
      // a3: goto aa
      // a6: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: aload 3
      // ab: aload 0
      // ac: getfield rip/breeze/client/RotationUtil9.arr_o [Ljava/lang/String;
      // af: iload 4
      // b1: aaload
      // b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b5: pop
      // b6: goto bd
      // b9: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc: athrow
      // bd: iinc 4 1
      // c0: aload 5
      // c2: ifnull 21
      // c5: aload 3
      // c6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c9: lload 1
      // ca: lconst_0
      // cb: lcmp
      // cc: iflt a0
      // cf: areturn
      // try (20 -> 46): 47 java/lang/NullPointerException
      // try (29 -> 62): 63 java/lang/NullPointerException
      // try (49 -> 73): 73 java/lang/NullPointerException
   }

   private char getChar(int param1, int param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 011: lxor
      // 012: lstore 3
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 129815729479247
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 65682827396597
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 026: astore 9
      // 028: aload 0
      // 029: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 02c: aload 0
      // 02d: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 030: if_icmpne 05e
      // 033: aload 0
      // 034: bipush 1
      // 035: lload 5
      // 037: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 03a: iload 2
      // 03b: iflt 06e
      // 03e: ifne 05e
      // 041: goto 048
      // 044: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: lload 7
      // 04b: sipush 15258
      // 04e: ldc2_w 8295100699875948146
      // 051: lload 3
      // 052: lxor
      // 053: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 056: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 059: athrow
      // 05a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 062: aload 0
      // 063: dup
      // 064: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 067: dup_x1
      // 068: bipush 1
      // 069: iadd
      // 06a: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 06d: caload
      // 06e: istore 10
      // 070: iload 10
      // 072: iload 2
      // 073: ifle 0de
      // 076: lookupswitch 478 11 10 457 34 475 39 475 47 475 92 475 98 445 102 454 110 448 114 451 116 442 117 98
      // 0d8: aload 0
      // 0d9: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 0dc: bipush 4
      // 0dd: iadd
      // 0de: iload 1
      // 0df: ifle 11c
      // 0e2: aload 0
      // 0e3: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 0e6: if_icmple 11b
      // 0e9: goto 0f0
      // 0ec: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: bipush 4
      // 0f2: lload 5
      // 0f4: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 0f7: iload 1
      // 0f8: iflt 11c
      // 0fb: ifne 11b
      // 0fe: goto 105
      // 101: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 0
      // 106: lload 7
      // 108: sipush 1424
      // 10b: ldc2_w 8876774249794209914
      // 10e: lload 3
      // 10f: lxor
      // 110: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 113: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 116: athrow
      // 117: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: bipush 0
      // 11c: istore 11
      // 11e: aload 0
      // 11f: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 122: istore 12
      // 124: iload 12
      // 126: bipush 4
      // 127: iadd
      // 128: istore 13
      // 12a: iload 12
      // 12c: iload 13
      // 12e: if_icmpge 21f
      // 131: aload 0
      // 132: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 135: iload 12
      // 137: caload
      // 138: istore 14
      // 13a: iload 11
      // 13c: bipush 4
      // 13d: ishl
      // 13e: i2c
      // 13f: istore 11
      // 141: iload 14
      // 143: bipush 48
      // 145: iload 1
      // 146: ifle 176
      // 149: if_icmplt 172
      // 14c: iload 14
      // 14e: bipush 57
      // 150: iload 2
      // 151: ifle 176
      // 154: if_icmpgt 172
      // 157: goto 15e
      // 15a: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: iload 11
      // 160: iload 14
      // 162: bipush 48
      // 164: isub
      // 165: iadd
      // 166: i2c
      // 167: istore 11
      // 169: aload 9
      // 16b: iload 1
      // 16c: ifle 21c
      // 16f: ifnull 217
      // 172: iload 14
      // 174: bipush 97
      // 176: iload 1
      // 177: ifle 1b1
      // 17a: if_icmplt 1ad
      // 17d: goto 184
      // 180: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: iload 14
      // 186: bipush 102
      // 188: iload 1
      // 189: ifle 1b1
      // 18c: if_icmpgt 1ad
      // 18f: goto 196
      // 192: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: iload 11
      // 198: iload 14
      // 19a: bipush 97
      // 19c: isub
      // 19d: bipush 10
      // 19f: iadd
      // 1a0: iadd
      // 1a1: i2c
      // 1a2: istore 11
      // 1a4: aload 9
      // 1a6: iload 2
      // 1a7: iflt 21c
      // 1aa: ifnull 217
      // 1ad: iload 14
      // 1af: bipush 65
      // 1b1: if_icmplt 1e0
      // 1b4: goto 1bb
      // 1b7: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: iload 14
      // 1bd: bipush 70
      // 1bf: if_icmpgt 1e0
      // 1c2: goto 1c9
      // 1c5: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: iload 11
      // 1cb: iload 14
      // 1cd: bipush 65
      // 1cf: isub
      // 1d0: bipush 10
      // 1d2: iadd
      // 1d3: iadd
      // 1d4: i2c
      // 1d5: istore 11
      // 1d7: aload 9
      // 1d9: iload 1
      // 1da: ifle 21c
      // 1dd: ifnull 217
      // 1e0: new java/lang/NumberFormatException
      // 1e3: dup
      // 1e4: new java/lang/StringBuilder
      // 1e7: dup
      // 1e8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1eb: sipush 28030
      // 1ee: ldc2_w 150544608698949822
      // 1f1: lload 3
      // 1f2: lxor
      // 1f3: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 1f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f9: new java/lang/String
      // 1fc: dup
      // 1fd: aload 0
      // 1fe: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 201: aload 0
      // 202: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 205: bipush 4
      // 206: invokespecial java/lang/String.<init> ([CII)V
      // 209: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20f: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 212: athrow
      // 213: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: iinc 12 1
      // 21a: aload 9
      // 21c: ifnull 12a
      // 21f: aload 0
      // 220: dup
      // 221: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 224: bipush 4
      // 225: iadd
      // 226: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 229: iload 11
      // 22b: iload 2
      // 22c: ifle 138
      // 22f: ireturn
      // 230: bipush 9
      // 232: ireturn
      // 233: bipush 8
      // 235: ireturn
      // 236: bipush 10
      // 238: ireturn
      // 239: bipush 13
      // 23b: ireturn
      // 23c: bipush 12
      // 23e: ireturn
      // 23f: aload 0
      // 240: dup
      // 241: getfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 244: bipush 1
      // 245: iadd
      // 246: putfield rip/breeze/client/RotationUtil9.fieldInt_g I
      // 249: aload 0
      // 24a: aload 0
      // 24b: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 24e: putfield rip/breeze/client/RotationUtil9.fieldInt_h I
      // 251: iload 10
      // 253: ireturn
      // 254: aload 0
      // 255: lload 7
      // 257: sipush 20456
      // 25a: ldc2_w 4870701736900870672
      // 25d: lload 3
      // 25e: lxor
      // 25f: invokestatic rip/breeze/client/RotationUtil9.buildString_7 (IJ)Ljava/lang/String;
      // 262: invokespecial rip/breeze/client/RotationUtil9.getIOException (JLjava/lang/String;)Ljava/io/IOException;
      // 265: athrow
      // try (26 -> 38): 39 java/io/IOException
      // try (31 -> 50): 50 java/io/IOException
      // try (63 -> 76): 77 java/io/IOException
      // try (67 -> 86): 87 java/io/IOException
      // try (79 -> 98): 98 java/io/IOException
      // try (122 -> 132): 133 java/io/IOException
      // try (142 -> 151): 152 java/io/IOException
      // try (146 -> 159): 160 java/io/IOException
      // try (171 -> 178): 179 java/io/IOException
      // try (175 -> 184): 185 java/io/IOException
      // try (196 -> 223): 223 java/io/IOException
   }

   private IOException getIOException(long var1, String var3) throws IOException {
      var1 = 118242208525211L ^ var1;
      long var4 = var1 ^ 107194386502771L;
      throw new BreezeException(var3 + this.buildString_4(var4));
   }

   private void calculate_12(short param1, int param2, short param3) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: getstatic rip/breeze/client/RotationUtil9.118242208525211L J
      // 1a: lxor
      // 1b: lstore 4
      // 1d: lload 4
      // 1f: dup2
      // 20: ldc2_w 41974718624070
      // 23: lxor
      // 24: lstore 6
      // 26: dup2
      // 27: ldc2_w 116968203502832
      // 2a: lxor
      // 2b: dup2
      // 2c: bipush 56
      // 2e: lushr
      // 2f: l2i
      // 30: istore 8
      // 32: dup2
      // 33: bipush 8
      // 35: lshl
      // 36: bipush 8
      // 38: lushr
      // 39: lstore 9
      // 3b: pop2
      // 3c: pop2
      // 3d: invokestatic rip/breeze/client/RotationUtil9.getStringArray ()[Ljava/lang/String;
      // 40: aload 0
      // 41: iload 8
      // 43: i2b
      // 44: lload 9
      // 46: bipush 1
      // 47: invokespecial rip/breeze/client/RotationUtil9.calculate_10 (BJZ)I
      // 4a: pop
      // 4b: astore 11
      // 4d: aload 0
      // 4e: dup
      // 4f: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 52: bipush 1
      // 53: isub
      // 54: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 57: aload 0
      // 58: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 5b: getstatic rip/breeze/client/RotationUtil9.CONST_A [C
      // 5e: arraylength
      // 5f: iadd
      // 60: aload 0
      // 61: getfield rip/breeze/client/RotationUtil9.fieldInt_f I
      // 64: if_icmple 84
      // 67: aload 0
      // 68: getstatic rip/breeze/client/RotationUtil9.CONST_A [C
      // 6b: arraylength
      // 6c: lload 6
      // 6e: invokespecial rip/breeze/client/RotationUtil9.checkCondition_3 (IJ)Z
      // 71: iload 3
      // 72: ifle 85
      // 75: ifne 84
      // 78: goto 7f
      // 7b: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: return
      // 80: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: bipush 0
      // 85: istore 12
      // 87: iload 12
      // 89: getstatic rip/breeze/client/RotationUtil9.CONST_A [C
      // 8c: arraylength
      // 8d: if_icmpge b6
      // 90: iload 3
      // 91: ifle b1
      // 94: aload 0
      // 95: getfield rip/breeze/client/RotationUtil9.arr_d [C
      // 98: aload 0
      // 99: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // 9c: iload 12
      // 9e: iadd
      // 9f: caload
      // a0: getstatic rip/breeze/client/RotationUtil9.CONST_A [C
      // a3: iload 12
      // a5: caload
      // a6: if_icmpeq ae
      // a9: return
      // aa: invokestatic rip/breeze/client/RotationUtil9.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad: athrow
      // ae: iinc 12 1
      // b1: aload 11
      // b3: ifnull 87
      // b6: aload 0
      // b7: dup
      // b8: getfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // bb: getstatic rip/breeze/client/RotationUtil9.CONST_A [C
      // be: arraylength
      // bf: iadd
      // c0: putfield rip/breeze/client/RotationUtil9.fieldInt_e I
      // c3: iload 2
      // c4: iflt 90
      // c7: return
      // try (51 -> 73): 74 java/io/IOException
      // try (65 -> 77): 77 java/io/IOException
      // try (85 -> 99): 99 java/io/IOException
   }

   static {
      long var0 = 53309900026260L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[42];
      int var5 = 0;
      String var6 = "«¶k;kÓf\u001f\u0099Y\u0002ôc\u0084\u0014J\u001a\u0080*ÖÃö{\u0082\u0010\u009c\u0011\u0002Jfâ-¦\u001c\u009f\rãTJ Æ8Èê?¹Ä\u0012\u009c3¯\u0097\u0005¢o\u0082`?réºçÎ|¿û0\u0003\u00adoÁ=£Öá\n²\u009e\u0092\"ÛD\u009e¦\u0097Kúêã\u0004ùÉþ¥s÷L\u009b Ä\u0015\u001c\u0005ô%Î¹\u001fg\"\u008b\u0005\u0019¼W\u0096*û\u0086Ð³\fþµ}$@\nqÂÁ`\u008czáX¥5¶Ý7Séi²\rÌo&\u0096º?Fr\u0080©\u0094Q£«RÒü\u0000à\u0003\u0007ä\u0017ðèü)å7y_rQ\u008dÞkðvõ nÌï\u009a\u0090Ã\u0093¨¨\u0093§\u0010\u0014(\u008dÎV\u008f:\u0015¸;\n\u0092ôÚkc\u0003ª\"Ñ\u0014õ¼Eµ]\u008f\u0097tl0Ký©\u001d\u0096YààqD\u0085\u009b=BH\u000bûDðaÜ\u0019\u009eOJMJnéUvÏ\u0017\u0005ä\u000bô,0G.³Á#\u008dÒ%ú(®ÍM\u0016\u0083¦\u009c\u000e§ áF\u0003\u0004nÉRY\u0081\u009f¯\u0015:\u0098¼\u0000æ\u0096Æ'¼Cx¤Q\u009cTIâÿ0ÈL÷³ Æ\u0081aºiî¢Ða\u001d\u0006Q Ì\u009b\u009b\u000f-tkMK\u0013Ì&nï\u001c8aõK*°Ê\u0097|QT\rnCà(\bæEÜ'\u0091\u0012\u0092Z¤ð0i{àp\u0091à\u0006_\u000b\u0093\u0092\u0017Ù2\u001aüd{3\u0007Ôq\bâÕ²Ñ78\u0095\u00989\u0006;\u0012\u0081\u0011\u009bXqý\u0016C|÷ÛÛ-÷Þ\u009d\bçÆ×x.eI2Åb<v\rÝXôÝ\u0015gR£\u0011¡y¬Ð2\u0014[ÀsÃ\u00988\u0095¨äY\u0013m\u008ex\u008c\u0084\u0007Ô\u0011£%\nc\u0095\u008eTÝÆ¼Á\u0000-gµÉ\u0002GWe\u0094i3nQ¬-×ÊU=)´tí½hÜÅ\u0016´q\u00938f\u0094±x\u0082É@üuÍ»\u0089£æ%¶ßq\u008cH8ÀËü\f\u0011\u001b¥\u0010!j\u009e\u0016\u0087\u001d\u001c\u009b ÃMvAÿµßºãEðß\\8\u0094f/4\u0018{¨ä\u001dò2ÅCÓ/Ðõ!Ò\u007f\u007fÐF<¡5Þ6¨ ÇË\u001fÒ\u008fæ?7\u001a\u0014\u001cuIìcÔ\u0013xÆG\u0099X6°2½Bé\u0083Nk  ðÌKì¶yd>`ô\u0097Æ<ä\u0019O\u0015\u00adÒao&/¨\u0084£(0\u00199z3@D?Û?þTGc,í(!J\u001a\u0091S¥\u001bÞä\t\u0086QJ)|\u0006k\u0099ã\u0015oøÄé´¦Þ\u0081\u0002\u0018i\u008d\u009b>½À!åÆ81sz«¯¡dOúr®Ù\u00840^\r°úå\u0094b\r\u0088ôM¶Úñ¼\u0002\u007f×\u001c\t½ùâ>þ\u0087¬\u0004'\u0011Äo\u008e\u0081òú*ÉYbÿÆ§\bô³ÄV\u0010ig\u0082rÐZÕgh4\u0085¤¶{×Æ8(0wª` Ý^ö\u007fÿH\t÷4%\rQp\u007fD\u0004Âì(é+2Jõ¸üøÌ)¾\u001e_Ñ\u0098\nÝñ\u0098O.%µ\u009e1z§T\u0012#½\u0010\u001e\u001cZ·_`üõ\u0007æG\f%U¼r8\u0089\nø\u0080x\u0000L_Àñm&KjØö*ã\u009e9Ê®eæC¼b6VñAM\u0084|À¢ V±PùiÁ¦\u0092«R\u0019\u009c\u00893©À©\u00ad«(ãÑ\u008b±]HHË\u0017á]Í°¦Ûã{ÁyÐHà¯q\u00adW ¹à(\u001bÛ¥KkG-¢-T(\u008c>XèR\u0005 \u0002%ó\u008cî6¼\td\u0011¯\u00988;|Ð6Ò\u009eB½¢\u001a6-Æ\u0094µ\u000eÑ`\u001dç\u0010ó\f_´¹üÃ`\u008cJ>^gdü\u009f(åH\u000bÝÿ\u0092÷~^\rÈ}yÑ\u0017~Ä¤!Ì\u0098\u0012D\u008e\u001a9&m\u008c6\u0004¶\u0093¸;ÙóFrÕ ¨»=\u0088Ö@Ý\u0005\u0012ÞTò³õ¤\u0098\u0084WFk\u008fÐËN\u0004ð6\u0090¼k\u0001£\u0010cýà~Q¯¶L\u0005µÝFe\u009ef¢0a Ï\u0012×[0ôÓv\u0000<\u0083\bÐf{.àD(ó´\u0097Ñ{6â\u0005*õÑ ÓE\u0003)gxE[\u0091Þ!\"{Ì\b0\u009b\u0014È{6;ÈÛl)\u0018À<dáÒÖÅ~ïÿÓ]\" ç\u000baÿeÄ\u0015ÒÀÿd_\u00adÎ\u009eÒ\u0098ºöÜ\u0083ÑD(ÒuEÜ\u0016#kÎ(KÒ5êÊ(½z\u008c\u009a©EE6¶ïÞ\b\u0010±\u0011û5é\u0002\u009ahð²\u0007\u0005\u0010\u0003Ì\u0016¸óÎÍä\u0087ZQJ]Üc\u0013 \u008aM¸B\u0096\u008d§rÓØ[\u001e\u0086É£V\u0092r\u0088Ük\u0002ì<\u001d\u008a=TÄ<¼\u0080(t\u0098\u0086\u008e\u0095\u001fGËhH6D\u0086í\u008b\u000bù 9Ìê\u0091\u000bBñ¦\u0085v\u0089]\u009a\u0089³0´B<wcÆ\u0010h¾zÖî\u0001nayÏ£\u0087\u0084s\u0006r\u0010\"#\u0006¿SµÏ$Wh];\u001f¿¬\u009f\u0010|ÌìÀ¹d[é'ßÍ\u000bå\u0014N©0~ÀñÀ\f 3ÝñT«ëNÆ·\u001b\"ëy\u001eá\u0001\u00901\u0014Ìoçý\u008bûÄLç>g0\u0091\u0088\u0004\u0019/S\u000ftã#]\u0010\u009e\u001a\b\u0091=%\u0089wJÕZx¦e\u000e\u00890Ã!¤Yþ3ã9t\u0002<ÃHÖPx»D\u000b,\u0012Z\u0082E\u0099*Ý\u0098\u0016¿KG\u000bCÅ\u001eÊõ¥r°á\u0081_\u0086 L\u0089\u0018öú¯;ç7=y©ê¶\u0006ùj4¸\u008a^\u0015\u001a\u0018t\u0015m";
      int var7 = "«¶k;kÓf\u001f\u0099Y\u0002ôc\u0084\u0014J\u001a\u0080*ÖÃö{\u0082\u0010\u009c\u0011\u0002Jfâ-¦\u001c\u009f\rãTJ Æ8Èê?¹Ä\u0012\u009c3¯\u0097\u0005¢o\u0082`?réºçÎ|¿û0\u0003\u00adoÁ=£Öá\n²\u009e\u0092\"ÛD\u009e¦\u0097Kúêã\u0004ùÉþ¥s÷L\u009b Ä\u0015\u001c\u0005ô%Î¹\u001fg\"\u008b\u0005\u0019¼W\u0096*û\u0086Ð³\fþµ}$@\nqÂÁ`\u008czáX¥5¶Ý7Séi²\rÌo&\u0096º?Fr\u0080©\u0094Q£«RÒü\u0000à\u0003\u0007ä\u0017ðèü)å7y_rQ\u008dÞkðvõ nÌï\u009a\u0090Ã\u0093¨¨\u0093§\u0010\u0014(\u008dÎV\u008f:\u0015¸;\n\u0092ôÚkc\u0003ª\"Ñ\u0014õ¼Eµ]\u008f\u0097tl0Ký©\u001d\u0096YààqD\u0085\u009b=BH\u000bûDðaÜ\u0019\u009eOJMJnéUvÏ\u0017\u0005ä\u000bô,0G.³Á#\u008dÒ%ú(®ÍM\u0016\u0083¦\u009c\u000e§ áF\u0003\u0004nÉRY\u0081\u009f¯\u0015:\u0098¼\u0000æ\u0096Æ'¼Cx¤Q\u009cTIâÿ0ÈL÷³ Æ\u0081aºiî¢Ða\u001d\u0006Q Ì\u009b\u009b\u000f-tkMK\u0013Ì&nï\u001c8aõK*°Ê\u0097|QT\rnCà(\bæEÜ'\u0091\u0012\u0092Z¤ð0i{àp\u0091à\u0006_\u000b\u0093\u0092\u0017Ù2\u001aüd{3\u0007Ôq\bâÕ²Ñ78\u0095\u00989\u0006;\u0012\u0081\u0011\u009bXqý\u0016C|÷ÛÛ-÷Þ\u009d\bçÆ×x.eI2Åb<v\rÝXôÝ\u0015gR£\u0011¡y¬Ð2\u0014[ÀsÃ\u00988\u0095¨äY\u0013m\u008ex\u008c\u0084\u0007Ô\u0011£%\nc\u0095\u008eTÝÆ¼Á\u0000-gµÉ\u0002GWe\u0094i3nQ¬-×ÊU=)´tí½hÜÅ\u0016´q\u00938f\u0094±x\u0082É@üuÍ»\u0089£æ%¶ßq\u008cH8ÀËü\f\u0011\u001b¥\u0010!j\u009e\u0016\u0087\u001d\u001c\u009b ÃMvAÿµßºãEðß\\8\u0094f/4\u0018{¨ä\u001dò2ÅCÓ/Ðõ!Ò\u007f\u007fÐF<¡5Þ6¨ ÇË\u001fÒ\u008fæ?7\u001a\u0014\u001cuIìcÔ\u0013xÆG\u0099X6°2½Bé\u0083Nk  ðÌKì¶yd>`ô\u0097Æ<ä\u0019O\u0015\u00adÒao&/¨\u0084£(0\u00199z3@D?Û?þTGc,í(!J\u001a\u0091S¥\u001bÞä\t\u0086QJ)|\u0006k\u0099ã\u0015oøÄé´¦Þ\u0081\u0002\u0018i\u008d\u009b>½À!åÆ81sz«¯¡dOúr®Ù\u00840^\r°úå\u0094b\r\u0088ôM¶Úñ¼\u0002\u007f×\u001c\t½ùâ>þ\u0087¬\u0004'\u0011Äo\u008e\u0081òú*ÉYbÿÆ§\bô³ÄV\u0010ig\u0082rÐZÕgh4\u0085¤¶{×Æ8(0wª` Ý^ö\u007fÿH\t÷4%\rQp\u007fD\u0004Âì(é+2Jõ¸üøÌ)¾\u001e_Ñ\u0098\nÝñ\u0098O.%µ\u009e1z§T\u0012#½\u0010\u001e\u001cZ·_`üõ\u0007æG\f%U¼r8\u0089\nø\u0080x\u0000L_Àñm&KjØö*ã\u009e9Ê®eæC¼b6VñAM\u0084|À¢ V±PùiÁ¦\u0092«R\u0019\u009c\u00893©À©\u00ad«(ãÑ\u008b±]HHË\u0017á]Í°¦Ûã{ÁyÐHà¯q\u00adW ¹à(\u001bÛ¥KkG-¢-T(\u008c>XèR\u0005 \u0002%ó\u008cî6¼\td\u0011¯\u00988;|Ð6Ò\u009eB½¢\u001a6-Æ\u0094µ\u000eÑ`\u001dç\u0010ó\f_´¹üÃ`\u008cJ>^gdü\u009f(åH\u000bÝÿ\u0092÷~^\rÈ}yÑ\u0017~Ä¤!Ì\u0098\u0012D\u008e\u001a9&m\u008c6\u0004¶\u0093¸;ÙóFrÕ ¨»=\u0088Ö@Ý\u0005\u0012ÞTò³õ¤\u0098\u0084WFk\u008fÐËN\u0004ð6\u0090¼k\u0001£\u0010cýà~Q¯¶L\u0005µÝFe\u009ef¢0a Ï\u0012×[0ôÓv\u0000<\u0083\bÐf{.àD(ó´\u0097Ñ{6â\u0005*õÑ ÓE\u0003)gxE[\u0091Þ!\"{Ì\b0\u009b\u0014È{6;ÈÛl)\u0018À<dáÒÖÅ~ïÿÓ]\" ç\u000baÿeÄ\u0015ÒÀÿd_\u00adÎ\u009eÒ\u0098ºöÜ\u0083ÑD(ÒuEÜ\u0016#kÎ(KÒ5êÊ(½z\u008c\u009a©EE6¶ïÞ\b\u0010±\u0011û5é\u0002\u009ahð²\u0007\u0005\u0010\u0003Ì\u0016¸óÎÍä\u0087ZQJ]Üc\u0013 \u008aM¸B\u0096\u008d§rÓØ[\u001e\u0086É£V\u0092r\u0088Ük\u0002ì<\u001d\u008a=TÄ<¼\u0080(t\u0098\u0086\u008e\u0095\u001fGËhH6D\u0086í\u008b\u000bù 9Ìê\u0091\u000bBñ¦\u0085v\u0089]\u009a\u0089³0´B<wcÆ\u0010h¾zÖî\u0001nayÏ£\u0087\u0084s\u0006r\u0010\"#\u0006¿SµÏ$Wh];\u001f¿¬\u009f\u0010|ÌìÀ¹d[é'ßÍ\u000bå\u0014N©0~ÀñÀ\f 3ÝñT«ëNÆ·\u001b\"ëy\u001eá\u0001\u00901\u0014Ìoçý\u008bûÄLç>g0\u0091\u0088\u0004\u0019/S\u000ftã#]\u0010\u009e\u001a\b\u0091=%\u0089wJÕZx¦e\u000e\u00890Ã!¤Yþ3ã9t\u0002<ÃHÖPx»D\u000b,\u0012Z\u0082E\u0099*Ý\u0098\u0016¿KG\u000bCÅ\u001eÊõ¥r°á\u0081_\u0086 L\u0089\u0018öú¯;ç7=y©ê¶\u0006ùj4¸\u008a^\u0015\u001a\u0018t\u0015m"
         .length();
      char var8 = 24;
      int var34 = -1;

      label73:
      while (true) {
         String var36 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = buildString_6(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var50;
                  if ((var34 += var8) >= var7) {
                     CONST_S = var4;
                     CONST_T = new String[42];
                     CONST_X = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[3];
                     int var14 = 0;
                     String var15 = "\u009d¬G¿\u0082àÓ=\u008f\u0013RHÝ\u0018&\u0012\u0000\u0097^ÛHñù\u009c";
                     int var16 = "\u009d¬G¿\u0082àÓ=\u008f\u0013RHÝ\u0018&\u0012\u0000\u0097^ÛHñù\u009c".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte[] var21 = var11.doFinal(
                           new byte[]{
                              (byte)(var19 >>> 56),
                              (byte)(var19 >>> 48),
                              (byte)(var19 >>> 40),
                              (byte)(var19 >>> 32),
                              (byte)(var19 >>> 24),
                              (byte)(var19 >>> 16),
                              (byte)(var19 >>> 8),
                              (byte)var19
                           }
                        );
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var58 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_V = var13;
                     CONST_W = new Integer[3];
                     CONST_A_2 = new HashMap(13);
                     Cipher var22;
                     var10000 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var23 = 1; var23 < 8; var23++) {
                        var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var24 = new long[4];
                     int var25 = 0;
                     String var26 = "îäü\u0081ÕBg\u0084\u0093ÃµcÍ\u0001H\u0017";
                     int var27 = "îäü\u0081ÕBg\u0084\u0093ÃµcÍ\u0001H\u0017".length();
                     byte var28 = 0;

                     label44:
                     while (true) {
                        int var46 = var28;
                        var28 += 8;
                        byte[] var29 = var26.substring(var46, var28).getBytes("ISO-8859-1");
                        long[] var40 = var24;
                        var46 = var25++;
                        long var55 = (var29[0] & 255L) << 56
                           | (var29[1] & 255L) << 48
                           | (var29[2] & 255L) << 40
                           | (var29[3] & 255L) << 32
                           | (var29[4] & 255L) << 24
                           | (var29[5] & 255L) << 16
                           | (var29[6] & 255L) << 8
                           | var29[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var30 = var55;
                           byte[] var32 = var22.doFinal(
                              new byte[]{
                                 (byte)(var30 >>> 56),
                                 (byte)(var30 >>> 48),
                                 (byte)(var30 >>> 40),
                                 (byte)(var30 >>> 32),
                                 (byte)(var30 >>> 24),
                                 (byte)(var30 >>> 16),
                                 (byte)(var30 >>> 8),
                                 (byte)var30
                              }
                           );
                           long var63 = (var32[0] & 255L) << 56
                              | (var32[1] & 255L) << 48
                              | (var32[2] & 255L) << 40
                              | (var32[3] & 255L) << 32
                              | (var32[4] & 255L) << 24
                              | (var32[5] & 255L) << 16
                              | (var32[6] & 255L) << 8
                              | var32[7] & 255L;
                           switch (var60) {
                              case 0:
                                 var40[var46] = var63;
                                 if (var28 >= var27) {
                                    CONST_Y = var24;
                                    CONST_Z = new Long[4];
                                    CONST_A = buildString_7(30036, 7411687998708888495L ^ var0).toCharArray();
                                    Util70.clientUtil25_a = new Lambda4();
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var46] = var63;
                                 if (var28 < var27) {
                                    continue label44;
                                 }

                                 var26 = "Ø /g\u001bÛ}\u00992µ\u000bJ¨6§\u0087";
                                 var27 = "Ø /g\u001bÛ}\u00992µ\u000bJ¨6§\u0087".length();
                                 var28 = 0;
                           }

                           byte var48 = var28;
                           var28 += 8;
                           var29 = var26.substring(var48, var28).getBytes("ISO-8859-1");
                           var40 = var24;
                           var46 = var25++;
                           var55 = (var29[0] & 255L) << 56
                              | (var29[1] & 255L) << 48
                              | (var29[2] & 255L) << 40
                              | (var29[3] & 255L) << 32
                              | (var29[4] & 255L) << 24
                              | (var29[5] & 255L) << 16
                              | (var29[6] & 255L) << 8
                              | var29[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var50;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label73;
                  }

                  var6 = "IöY)\u0010u¶½\u001cR\u009dá&L\u000fä^/\u0095[qê\u0093C¿¤\u001aè\u0010-êQ0»ÜÊ\u001dêõÎÄû\u000fC\u0099;\u00ado\u007fdIí)µ!ÐP\u0003´=Ð\u001a(»EQýo8ºeÚ)¾»/þ3è\u0080½";
                  var7 = "IöY)\u0010u¶½\u001cR\u009dá&L\u000fä^/\u0095[qê\u0093C¿¤\u001aè\u0010-êQ0»ÜÊ\u001dêõÎÄû\u000fC\u0099;\u00ado\u007fdIí)µ!ÐP\u0003´=Ð\u001a(»EQýo8ºeÚ)¾»/þ3è\u0080½"
                     .length();
                  var8 = ' ';
                  var34 = -1;
            }

            var36 = var6.substring(++var34, var34 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(String[] var0) {
      arr_q = var0;
   }

   public static String[] getStringArray() {
      return arr_q;
   }

   private static Exception getException(Exception var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14204;
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
            throw new RuntimeException("rip/breeze/client/cm", var10);
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

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3226;
      if (CONST_W[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_V[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_X.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/cm", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_W[var3] = var15;
      }

      return CONST_W[var3];
   }

   private static long decrypt_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29155;
      if (CONST_Z[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_Y[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_A_2.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A_2.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/cm", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_Z[var3] = var14;
      }

      return CONST_Z[var3];
   }
}
