package rip.breeze.inject;

import java.util.List;

public class BreezeClass12 extends Util140 {
   public int int_û;
   public String string_ú;
   public String string_ù;
   public String string_ø;
   public List<String> list_ö;
   public List<բ> list_õ;
   public List<ù> list_ô;
   public List<ù> list_ó;
   public List<ø> list_ò;
   public List<ø> list_ñ;
   public List<õ> list_ð;
   public Object object_ï;
   public int int_î;
   public List<ù>[] arr_í;
   public int int_ì;
   public List<ù>[] arr_ë;
   public թ թ_ê;
   public List<ա> list_é;
   public int int_è;
   public int int_ç;
   public List<է> list_æ;
   public List<ö> list_å;
   public List<ö> list_ä;
   private boolean bool_ã;
   private static boolean bool_â;

   public BreezeClass12(long var1) {
      var1 = encKey_C ^ var1;
      long var3 = var1 ^ 8963186189341L;
      this(var3, 589824);
      if (this.getClass() != BreezeClass12.class) {
         throw new IllegalStateException();
      }
   }

   public BreezeClass12(long var1, int var3) {
      var1 = encKey_C ^ var1;
      long var4 = var1 ^ 82145405308922L;
      super(var3, var4);
      this.թ_ê = new թ();
   }

   public BreezeClass12(int var1, short var2, int var3, String var4, String var5, String var6, short var7, String[] var8) {
      long var9 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ encKey_C;
      long var11 = var9 ^ 135679738658438L;
      this(589824, var3, var4, var5, var6, var8, var11);
      if (this.getClass() != BreezeClass12.class) {
         throw new IllegalStateException();
      }
   }

   public BreezeClass12(int param1, int param2, String param3, String param4, String param5, String[] param6, long param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/BreezeClass12.encKey_C J
      // 03: lload 7
      // 05: lxor
      // 06: lstore 7
      // 08: lload 7
      // 0a: dup2
      // 0b: ldc2_w 108282646193275
      // 0e: lxor
      // 0f: lstore 9
      // 11: dup2
      // 12: ldc2_w 6268337492843
      // 15: lxor
      // 16: lstore 11
      // 18: pop2
      // 19: aload 0
      // 1a: iload 1
      // 1b: lload 11
      // 1d: invokespecial rip/breeze/inject/Util140.<init> (IJ)V
      // 20: aload 0
      // 21: iload 2
      // 22: putfield rip/breeze/inject/BreezeClass12.int_û I
      // 25: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 28: aload 0
      // 29: aload 3
      // 2a: putfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 2d: istore 13
      // 2f: aload 0
      // 30: aload 4
      // 32: putfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 35: aload 0
      // 36: aload 5
      // 38: putfield rip/breeze/inject/BreezeClass12.string_ø Ljava/lang/String;
      // 3b: aload 0
      // 3c: lload 9
      // 3e: aload 6
      // 40: bipush 2
      // 41: anewarray 60
      // 44: dup_x1
      // 45: swap
      // 46: bipush 1
      // 47: swap
      // 48: aastore
      // 49: dup_x2
      // 4a: dup_x2
      // 4b: pop
      // 4c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f: bipush 0
      // 50: swap
      // 51: aastore
      // 52: invokestatic rip/breeze/inject/ԧ.method_003 ([Ljava/lang/Object;)Ljava/util/List;
      // 55: putfield rip/breeze/inject/BreezeClass12.list_ö Ljava/util/List;
      // 58: iload 13
      // 5a: ifeq 95
      // 5d: iload 2
      // 5e: sipush 1024
      // 61: iand
      // 62: ifne 7f
      // 65: goto 6c
      // 68: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6b: athrow
      // 6c: aload 0
      // 6d: new java/util/ArrayList
      // 70: dup
      // 71: bipush 5
      // 72: invokespecial java/util/ArrayList.<init> (I)V
      // 75: putfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 78: goto 7f
      // 7b: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7e: athrow
      // 7f: aload 0
      // 80: new java/util/ArrayList
      // 83: dup
      // 84: invokespecial java/util/ArrayList.<init> ()V
      // 87: putfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 8a: aload 0
      // 8b: new rip/breeze/inject/թ
      // 8e: dup
      // 8f: invokespecial rip/breeze/inject/թ.<init> ()V
      // 92: putfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 95: return
      // try (26 -> 57): 58 java/lang/IllegalStateException
      // try (53 -> 66): 67 java/lang/IllegalStateException
   }

   @Override
   public void processAll(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 5
      // 1d: pop
      // 1e: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 21: istore 6
      // 23: lload 3
      // 24: lconst_0
      // 25: lcmp
      // 26: iflt 63
      // 29: aload 0
      // 2a: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 2d: iload 6
      // 2f: ifeq 53
      // 32: ifnonnull 4f
      // 35: goto 3c
      // 38: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: new java/util/ArrayList
      // 40: dup
      // 41: bipush 5
      // 42: invokespecial java/util/ArrayList.<init> (I)V
      // 45: putfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 53: new rip/breeze/inject/բ
      // 56: dup
      // 57: aload 2
      // 58: iload 5
      // 5a: invokespecial rip/breeze/inject/բ.<init> (Ljava/lang/String;I)V
      // 5d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 62: pop
      // 63: return
      // try (21 -> 30): 31 java/lang/IllegalStateException
      // try (29 -> 39): 40 java/lang/IllegalStateException
   }

   @Override
   public ü getÜ(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 89120744177644L;
      int var4 = (int)((var2 ^ 89120744177644L) >>> 48);
      int var5 = (int)((var2 ^ 89120744177644L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      ԇ var7 = new ԇ(this, 0);
      return new ù((char)var4, var5, var6, var7);
   }

   @Override
   public ü getÜ_2(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: istore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: pop
      // 1e: lload 4
      // 20: dup2
      // 21: ldc2_w 94475943077839
      // 24: lxor
      // 25: lstore 6
      // 27: dup2
      // 28: ldc2_w 112747572853046
      // 2b: lxor
      // 2c: lstore 8
      // 2e: pop2
      // 2f: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 32: new rip/breeze/inject/ù
      // 35: dup
      // 36: aload 2
      // 37: lload 8
      // 39: invokespecial rip/breeze/inject/ù.<init> (Ljava/lang/String;J)V
      // 3c: astore 10
      // 3e: istore 11
      // 40: iload 11
      // 42: ifne 7d
      // 45: iload 3
      // 46: ifeq 89
      // 49: goto 50
      // 4c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 0
      // 52: getfield rip/breeze/inject/BreezeClass12.list_ô Ljava/util/List;
      // 55: lload 6
      // 57: aload 10
      // 59: bipush 3
      // 5a: anewarray 60
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 2
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 73: putfield rip/breeze/inject/BreezeClass12.list_ô Ljava/util/List;
      // 76: goto 7d
      // 79: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7c: athrow
      // 7d: lload 4
      // 7f: lconst_0
      // 80: lcmp
      // 81: ifle af
      // 84: iload 11
      // 86: ifeq b6
      // 89: aload 0
      // 8a: aload 0
      // 8b: getfield rip/breeze/inject/BreezeClass12.list_ó Ljava/util/List;
      // 8e: lload 6
      // 90: aload 10
      // 92: bipush 3
      // 93: anewarray 60
      // 96: dup_x1
      // 97: swap
      // 98: bipush 2
      // 99: swap
      // 9a: aastore
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 1
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: bipush 0
      // a7: swap
      // a8: aastore
      // a9: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // ac: putfield rip/breeze/inject/BreezeClass12.list_ó Ljava/util/List;
      // af: goto b6
      // b2: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b5: athrow
      // b6: aload 10
      // b8: areturn
      // try (37 -> 41): 42 java/lang/IllegalStateException
      // try (39 -> 70): 71 java/lang/IllegalStateException
      // try (73 -> 105): 106 java/lang/IllegalStateException
   }

   @Override
   public ü getÜ_3(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast rip/breeze/inject/և
      // 11: astore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/String
      // 18: astore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/Long
      // 20: invokevirtual java/lang/Long.longValue ()J
      // 23: lstore 5
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/Boolean
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: istore 7
      // 30: pop
      // 31: lload 5
      // 33: dup2
      // 34: ldc2_w 88435265684733
      // 37: lxor
      // 38: lstore 8
      // 3a: dup2
      // 3b: ldc2_w 52320964735300
      // 3e: lxor
      // 3f: lstore 10
      // 41: pop2
      // 42: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 45: new rip/breeze/inject/ø
      // 48: dup
      // 49: lload 10
      // 4b: iload 2
      // 4c: aload 3
      // 4d: aload 4
      // 4f: invokespecial rip/breeze/inject/ø.<init> (JILrip/breeze/inject/և;Ljava/lang/String;)V
      // 52: astore 12
      // 54: istore 13
      // 56: iload 13
      // 58: ifeq 94
      // 5b: iload 7
      // 5d: ifeq a0
      // 60: goto 67
      // 63: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 66: athrow
      // 67: aload 0
      // 68: aload 0
      // 69: getfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 6c: lload 8
      // 6e: aload 12
      // 70: bipush 3
      // 71: anewarray 60
      // 74: dup_x1
      // 75: swap
      // 76: bipush 2
      // 77: swap
      // 78: aastore
      // 79: dup_x2
      // 7a: dup_x2
      // 7b: pop
      // 7c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x1
      // 83: swap
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 8a: putfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 8d: goto 94
      // 90: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 93: athrow
      // 94: lload 5
      // 96: lconst_0
      // 97: lcmp
      // 98: ifle c6
      // 9b: iload 13
      // 9d: ifne cd
      // a0: aload 0
      // a1: aload 0
      // a2: getfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // a5: lload 8
      // a7: aload 12
      // a9: bipush 3
      // aa: anewarray 60
      // ad: dup_x1
      // ae: swap
      // af: bipush 2
      // b0: swap
      // b1: aastore
      // b2: dup_x2
      // b3: dup_x2
      // b4: pop
      // b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b8: bipush 1
      // b9: swap
      // ba: aastore
      // bb: dup_x1
      // bc: swap
      // bd: bipush 0
      // be: swap
      // bf: aastore
      // c0: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // c3: putfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // c6: goto cd
      // c9: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // cc: athrow
      // cd: aload 12
      // cf: areturn
      // try (50 -> 54): 55 java/lang/IllegalStateException
      // try (52 -> 83): 84 java/lang/IllegalStateException
      // try (86 -> 118): 119 java/lang/IllegalStateException
   }

   @Override
   public void processAll_5(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Boolean
      // 1c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f: istore 5
      // 21: pop
      // 22: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 25: istore 6
      // 27: iload 6
      // 29: lload 2
      // 2a: lconst_0
      // 2b: lcmp
      // 2c: iflt 53
      // 2f: ifeq 4b
      // 32: iload 5
      // 34: ifeq 56
      // 37: goto 3e
      // 3a: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: iload 4
      // 41: putfield rip/breeze/inject/BreezeClass12.int_î I
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4a: athrow
      // 4b: lload 2
      // 4c: lconst_0
      // 4d: lcmp
      // 4e: ifle 5c
      // 51: iload 6
      // 53: ifne 63
      // 56: aload 0
      // 57: iload 4
      // 59: putfield rip/breeze/inject/BreezeClass12.int_ì I
      // 5c: goto 63
      // 5f: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 62: athrow
      // 63: return
      // try (22 -> 30): 31 java/lang/IllegalStateException
      // try (28 -> 36): 37 java/lang/IllegalStateException
      // try (39 -> 48): 49 java/lang/IllegalStateException
   }

   @Override
   public ü getÜ_4(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Boolean
      // 023: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 026: istore 6
      // 028: pop
      // 029: lload 4
      // 02b: dup2
      // 02c: ldc2_w 71028356076913
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 103659778763021
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 119987935901684
      // 03d: lxor
      // 03e: lstore 11
      // 040: pop2
      // 041: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 044: new rip/breeze/inject/ù
      // 047: dup
      // 048: aload 3
      // 049: lload 11
      // 04b: invokespecial rip/breeze/inject/ù.<init> (Ljava/lang/String;J)V
      // 04e: astore 13
      // 050: istore 14
      // 052: iload 6
      // 054: ifeq 0d4
      // 057: aload 0
      // 058: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 05b: iload 14
      // 05d: lload 4
      // 05f: lconst_0
      // 060: lcmp
      // 061: ifle 0a3
      // 064: ifne 0a2
      // 067: goto 06e
      // 06a: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06d: athrow
      // 06e: ifnonnull 09e
      // 071: goto 078
      // 074: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 077: athrow
      // 078: aload 0
      // 079: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 07c: lload 7
      // 07e: bipush 2
      // 07f: anewarray 60
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: invokestatic rip/breeze/inject/MathUtil3.clamp_3 ([Ljava/lang/Object;)I
      // 093: istore 15
      // 095: aload 0
      // 096: iload 15
      // 098: anewarray 152
      // 09b: putfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 09e: aload 0
      // 09f: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0a2: iload 2
      // 0a3: aload 0
      // 0a4: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0a7: iload 2
      // 0a8: aaload
      // 0a9: lload 9
      // 0ab: aload 13
      // 0ad: bipush 3
      // 0ae: anewarray 60
      // 0b1: dup_x1
      // 0b2: swap
      // 0b3: bipush 2
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 1
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: bipush 0
      // 0c2: swap
      // 0c3: aastore
      // 0c4: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 0c7: aastore
      // 0c8: lload 4
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: ifle 0d4
      // 0cf: iload 14
      // 0d1: ifeq 145
      // 0d4: aload 0
      // 0d5: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 0d8: iload 14
      // 0da: lload 4
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: iflt 120
      // 0e1: ifne 11f
      // 0e4: goto 0eb
      // 0e7: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ea: athrow
      // 0eb: ifnonnull 11b
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0f9: lload 7
      // 0fb: bipush 2
      // 0fc: anewarray 60
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x1
      // 109: swap
      // 10a: bipush 0
      // 10b: swap
      // 10c: aastore
      // 10d: invokestatic rip/breeze/inject/MathUtil3.clamp_3 ([Ljava/lang/Object;)I
      // 110: istore 15
      // 112: aload 0
      // 113: iload 15
      // 115: anewarray 152
      // 118: putfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 11b: aload 0
      // 11c: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 11f: iload 2
      // 120: aload 0
      // 121: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 124: iload 2
      // 125: aaload
      // 126: lload 9
      // 128: aload 13
      // 12a: bipush 3
      // 12b: anewarray 60
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 2
      // 131: swap
      // 132: aastore
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x1
      // 13d: swap
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 144: aastore
      // 145: aload 13
      // 147: areturn
      // try (47 -> 57): 58 java/lang/IllegalStateException
      // try (49 -> 61): 62 java/lang/IllegalStateException
      // try (89 -> 131): 132 java/lang/IllegalStateException
      // try (123 -> 135): 136 java/lang/IllegalStateException
   }

   public void invoke_7(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 100452819297314L;
      this.list_ð = ԧ.method_001(new Object[]{this.list_ð, var5, var2});
   }

   public void invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   @Override
   public void processAll_3(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      Object[] var6 = (Object[])var1[3];
      int var7 = (Integer)var1[4];
      Object[] var8 = (Object[])var1[5];
      long var9 = var3 ^ 22421377790956L;
      long var11 = var3 ^ 87421684005165L;
      long var10001 = var3 ^ 1216405011445L;
      int var13 = (int)((var3 ^ 1216405011445L) >>> 32);
      int var14 = (int)((var3 ^ 1216405011445L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);

      թ var10000;
      չ var10002;
      int var10003;
      int var10004;
      Object[] var10005;
      label22: {
         try {
            var10000 = this.թ_ê;
            var20 = new չ();
            var10002 = var20;
            var10003 = var2;
            var10004 = var5;
            if (var6 == null) {
               var10005 = null;
               break label22;
            }
         } catch (IllegalStateException var19) {
            throw getIllegalStateException(var19);
         }

         var10005 = this.method_003(new Object[]{var6, var9});
      }

      Object[] var16 = var8 == null ? null : this.method_003(new Object[]{var8, var9});
      int var17 = var7;
      Object[] var18 = var10005;
      /* constructor call removed */
      var10000.method_012(new Object[]{var20, var11});
   }

   public void invoke_10(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 41053287679651L;
      this.թ_ê.method_012(new Object[]{new շ(var2), var5});
   }

   public void invoke_11(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      long var6 = var3 ^ 112158754831427L;
      this.թ_ê.method_012(new Object[]{new ն(var2, var5), var6});
   }

   public void invoke_12(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      long var6 = var2 ^ 10059487060369L;
      this.թ_ê.method_012(new Object[]{new ի(var4, var5), var6});
   }

   public void invoke_13(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      long var6 = var3 ^ 100671985744706L;
      this.թ_ê.method_012(new Object[]{new լ(var2, var5), var6});
   }

   public void invoke_14(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      long var8 = var3 ^ 130396810298311L;
      this.թ_ê.method_012(new Object[]{new պ(var2, var5, var6, var7), var8});
   }

   @Override
   public void processAll_4(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/String
      // 1c: astore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/String
      // 24: astore 6
      // 26: dup
      // 27: bipush 4
      // 28: aaload
      // 29: checkcast java/lang/String
      // 2c: astore 7
      // 2e: dup
      // 2f: bipush 5
      // 30: aaload
      // 31: checkcast java/lang/Boolean
      // 34: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 37: istore 8
      // 39: pop
      // 3a: lload 2
      // 3b: dup2
      // 3c: ldc2_w 0
      // 3f: lxor
      // 40: lstore 9
      // 42: dup2
      // 43: ldc2_w 120182200870308
      // 46: lxor
      // 47: lstore 11
      // 49: pop2
      // 4a: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 4d: istore 13
      // 4f: aload 0
      // 50: getfield rip/breeze/inject/BreezeClass12.þ I
      // 53: ldc_w 327680
      // 56: iload 13
      // 58: ifeq ce
      // 5b: if_icmpge c9
      // 5e: goto 65
      // 61: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 64: athrow
      // 65: iload 4
      // 67: sipush 256
      // 6a: iand
      // 6b: iload 13
      // 6d: ifeq cf
      // 70: goto 77
      // 73: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 76: athrow
      // 77: lload 2
      // 78: lconst_0
      // 79: lcmp
      // 7a: iflt cb
      // 7d: ifne c9
      // 80: goto 87
      // 83: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 86: athrow
      // 87: aload 0
      // 88: lload 9
      // 8a: iload 4
      // 8c: aload 5
      // 8e: aload 6
      // 90: aload 7
      // 92: iload 8
      // 94: bipush 6
      // 96: anewarray 60
      // 99: dup_x1
      // 9a: swap
      // 9b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9e: bipush 5
      // 9f: swap
      // a0: aastore
      // a1: dup_x1
      // a2: swap
      // a3: bipush 4
      // a4: swap
      // a5: aastore
      // a6: dup_x1
      // a7: swap
      // a8: bipush 3
      // a9: swap
      // aa: aastore
      // ab: dup_x1
      // ac: swap
      // ad: bipush 2
      // ae: swap
      // af: aastore
      // b0: dup_x1
      // b1: swap
      // b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b5: bipush 1
      // b6: swap
      // b7: aastore
      // b8: dup_x2
      // b9: dup_x2
      // ba: pop
      // bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: invokespecial rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // c4: return
      // c5: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // c8: athrow
      // c9: iload 4
      // cb: sipush -257
      // ce: iand
      // cf: istore 14
      // d1: aload 0
      // d2: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // d5: new rip/breeze/inject/կ
      // d8: dup
      // d9: iload 14
      // db: aload 5
      // dd: aload 6
      // df: aload 7
      // e1: iload 8
      // e3: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // e6: lload 11
      // e8: bipush 2
      // e9: anewarray 60
      // ec: dup_x2
      // ed: dup_x2
      // ee: pop
      // ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // f2: bipush 1
      // f3: swap
      // f4: aastore
      // f5: dup_x1
      // f6: swap
      // f7: bipush 0
      // f8: swap
      // f9: aastore
      // fa: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // fd: return
      // try (47 -> 53): 54 java/lang/IllegalStateException
      // try (52 -> 61): 62 java/lang/IllegalStateException
      // try (56 -> 69): 70 java/lang/IllegalStateException
      // try (64 -> 117): 117 java/lang/IllegalStateException
   }

   public void invoke_16(Object... var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      º var6 = (º)var1[3];
      Object[] var7 = (Object[])var1[4];
      long var8 = var4 ^ 36818621623243L;
      this.թ_ê.method_012(new Object[]{new յ(var2, var3, var6, var7), var8});
   }

   public void invoke_17(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      ª var5 = (ª)var1[2];
      long var6 = var2 ^ 61412937226730L;
      long var8 = var2 ^ 30417800736742L;
      this.թ_ê.method_012(new Object[]{new մ(var4, this.getՃ(new Object[]{var6, var5})), var8});
   }

   public void invoke_18(Object[] var1) {
      ª var2 = (ª)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 76775508979867L;
      long var7 = var3 ^ 116150185445015L;
      this.թ_ê.method_012(new Object[]{this.getՃ(new Object[]{var5, var2}), var7});
   }

   public void invoke_19(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 71326636257521L;
      this.թ_ê.method_012(new Object[]{new ղ(var2), var5});
   }

   public void invoke_20(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      long var6 = var2 ^ 30620444456470L;
      this.թ_ê.method_012(new Object[]{new ո(var4, var5), var6});
   }

   public void invoke_21(Object... var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      ª var6 = (ª)var1[3];
      ª[] var7 = (ª[])var1[4];
      long var8 = var2 ^ 49698107954038L;
      long var10 = var2 ^ 28442449467063L;
      long var12 = var2 ^ 1390972364154L;
      long var14 = var2 ^ 41771124166996L;
      this.թ_ê.method_012(new Object[]{new խ(var4, var10, var5, this.getՃ(new Object[]{var8, var6}), this.method_002(new Object[]{var14, var7})), var12});
   }

   public void invoke_22(Object[] var1) {
      ª var2 = (ª)var1[0];
      int[] var3 = (int[])var1[1];
      long var4 = (Long)var1[2];
      ª[] var6 = (ª[])var1[3];
      long var7 = var4 ^ 123655913547733L;
      long var9 = var4 ^ 101180851540441L;
      long var11 = var4 ^ 66256635462600L;
      long var13 = var4 ^ 132732841338359L;
      this.թ_ê.method_012(new Object[]{new հ(this.getՃ(new Object[]{var7, var2}), var3, var11, this.method_002(new Object[]{var13, var6})), var9});
   }

   public void invoke_23(Object[] var1) {
      String var2 = (String)var1[0];
      int var3 = (Integer)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 99817394590862L;
      this.թ_ê.method_012(new Object[]{new ծ(var2, var3), var6});
   }

   @Override
   public ü getÜ_5(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/և
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Boolean
      // 02b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02e: istore 7
      // 030: pop
      // 031: lload 5
      // 033: dup2
      // 034: ldc2_w 140732225460007
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 22990168734
      // 03e: lxor
      // 03f: lstore 10
      // 041: pop2
      // 042: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 045: aload 0
      // 046: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 049: bipush 0
      // 04a: anewarray 60
      // 04d: invokevirtual rip/breeze/inject/թ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 050: astore 12
      // 052: istore 13
      // 054: aload 12
      // 056: bipush 0
      // 057: anewarray 60
      // 05a: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 05d: bipush -1
      // 05e: if_icmpne 071
      // 061: aload 12
      // 063: bipush 0
      // 064: anewarray 60
      // 067: invokevirtual rip/breeze/inject/ջ.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 06a: astore 12
      // 06c: iload 13
      // 06e: ifeq 054
      // 071: new rip/breeze/inject/ø
      // 074: dup
      // 075: lload 10
      // 077: iload 2
      // 078: aload 3
      // 079: aload 4
      // 07b: invokespecial rip/breeze/inject/ø.<init> (JILrip/breeze/inject/և;Ljava/lang/String;)V
      // 07e: astore 14
      // 080: iload 13
      // 082: lload 5
      // 084: lconst_0
      // 085: lcmp
      // 086: ifle 06e
      // 089: lload 5
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: iflt 0d7
      // 090: ifne 0ce
      // 093: iload 7
      // 095: ifeq 0da
      // 098: goto 09f
      // 09b: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09e: athrow
      // 09f: aload 12
      // 0a1: aload 12
      // 0a3: getfield rip/breeze/inject/ջ.list_í_2 Ljava/util/List;
      // 0a6: lload 8
      // 0a8: aload 14
      // 0aa: bipush 3
      // 0ab: anewarray 60
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 2
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 1
      // 0ba: swap
      // 0bb: aastore
      // 0bc: dup_x1
      // 0bd: swap
      // 0be: bipush 0
      // 0bf: swap
      // 0c0: aastore
      // 0c1: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 0c4: putfield rip/breeze/inject/ջ.list_í_2 Ljava/util/List;
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cd: athrow
      // 0ce: lload 5
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: iflt 102
      // 0d5: iload 13
      // 0d7: ifeq 109
      // 0da: aload 12
      // 0dc: aload 12
      // 0de: getfield rip/breeze/inject/ջ.list_ì_2 Ljava/util/List;
      // 0e1: lload 8
      // 0e3: aload 14
      // 0e5: bipush 3
      // 0e6: anewarray 60
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 2
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 1
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 0ff: putfield rip/breeze/inject/ջ.list_ì_2 Ljava/util/List;
      // 102: goto 109
      // 105: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 108: athrow
      // 109: aload 14
      // 10b: areturn
      // try (69 -> 81): 82 java/lang/IllegalStateException
      // try (79 -> 110): 111 java/lang/IllegalStateException
      // try (113 -> 145): 146 java/lang/IllegalStateException
   }

   public void invoke_25(Object[] var1) {
      ª var2 = (ª)var1[0];
      ª var3 = (ª)var1[1];
      ª var4 = (ª)var1[2];
      String var5 = (String)var1[3];
      long var6 = (Long)var1[4];
      long var8 = var6 ^ 9748735389505L;
      long var10 = var6 ^ 92882924309188L;
      ա var12 = new ա(this.getՃ(new Object[]{var8, var2}), this.getՃ(new Object[]{var8, var3}), this.getՃ(new Object[]{var8, var4}), var5);
      this.list_é = ԧ.method_001(new Object[]{this.list_é, var10, var12});
   }

   @Override
   public ü getÜ_6(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast rip/breeze/inject/և
      // 1b: astore 5
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/String
      // 23: astore 6
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/Boolean
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: istore 7
      // 30: pop
      // 31: lload 3
      // 32: dup2
      // 33: ldc2_w 5171187347566
      // 36: lxor
      // 37: lstore 8
      // 39: dup2
      // 3a: ldc2_w 135581897344471
      // 3d: lxor
      // 3e: lstore 10
      // 40: pop2
      // 41: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 44: aload 0
      // 45: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 48: iload 2
      // 49: ldc_w 16776960
      // 4c: iand
      // 4d: bipush 8
      // 4f: ishr
      // 50: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 55: checkcast rip/breeze/inject/ա
      // 58: astore 12
      // 5a: new rip/breeze/inject/ø
      // 5d: dup
      // 5e: lload 10
      // 60: iload 2
      // 61: aload 5
      // 63: aload 6
      // 65: invokespecial rip/breeze/inject/ø.<init> (JILrip/breeze/inject/և;Ljava/lang/String;)V
      // 68: astore 13
      // 6a: istore 14
      // 6c: iload 14
      // 6e: ifeq ac
      // 71: iload 7
      // 73: ifeq b7
      // 76: goto 7d
      // 79: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7c: athrow
      // 7d: aload 12
      // 7f: aload 12
      // 81: getfield rip/breeze/inject/ա.list_û_2 Ljava/util/List;
      // 84: lload 8
      // 86: aload 13
      // 88: bipush 3
      // 89: anewarray 60
      // 8c: dup_x1
      // 8d: swap
      // 8e: bipush 2
      // 8f: swap
      // 90: aastore
      // 91: dup_x2
      // 92: dup_x2
      // 93: pop
      // 94: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 97: bipush 1
      // 98: swap
      // 99: aastore
      // 9a: dup_x1
      // 9b: swap
      // 9c: bipush 0
      // 9d: swap
      // 9e: aastore
      // 9f: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // a2: putfield rip/breeze/inject/ա.list_û_2 Ljava/util/List;
      // a5: goto ac
      // a8: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // ab: athrow
      // ac: lload 3
      // ad: lconst_0
      // ae: lcmp
      // af: iflt df
      // b2: iload 14
      // b4: ifne e6
      // b7: aload 12
      // b9: aload 12
      // bb: getfield rip/breeze/inject/ա.list_ú_2 Ljava/util/List;
      // be: lload 8
      // c0: aload 13
      // c2: bipush 3
      // c3: anewarray 60
      // c6: dup_x1
      // c7: swap
      // c8: bipush 2
      // c9: swap
      // ca: aastore
      // cb: dup_x2
      // cc: dup_x2
      // cd: pop
      // ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d1: bipush 1
      // d2: swap
      // d3: aastore
      // d4: dup_x1
      // d5: swap
      // d6: bipush 0
      // d7: swap
      // d8: aastore
      // d9: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // dc: putfield rip/breeze/inject/ա.list_ú_2 Ljava/util/List;
      // df: goto e6
      // e2: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // e5: athrow
      // e6: aload 13
      // e8: areturn
      // try (60 -> 64): 65 java/lang/IllegalStateException
      // try (62 -> 93): 94 java/lang/IllegalStateException
      // try (96 -> 128): 129 java/lang/IllegalStateException
   }

   public void invoke_27(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      ª var5 = (ª)var1[3];
      long var6 = (Long)var1[4];
      ª var8 = (ª)var1[5];
      int var9 = (Integer)var1[6];
      long var10 = var6 ^ 73271480286092L;
      long var12 = var6 ^ 33019319590409L;
      է var14 = new է(var2, var3, var4, this.getՃ(new Object[]{var10, var5}), this.getՃ(new Object[]{var10, var8}), var9);
      this.list_æ = ԧ.method_001(new Object[]{this.list_æ, var12, var14});
   }

   @Override
   public ü getÜ_7(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/և
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast [Lrip/breeze/inject/ª;
      // 023: astore 6
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast [Lrip/breeze/inject/ª;
      // 02b: astore 7
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast [I
      // 033: astore 8
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast java/lang/String
      // 03c: astore 9
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: istore 10
      // 04a: pop
      // 04b: lload 4
      // 04d: dup2
      // 04e: ldc2_w 33970028470241
      // 051: lxor
      // 052: lstore 11
      // 054: dup2
      // 055: ldc2_w 63355022061016
      // 058: lxor
      // 059: lstore 13
      // 05b: dup2
      // 05c: ldc2_w 81981600774214
      // 05f: lxor
      // 060: lstore 15
      // 062: pop2
      // 063: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 066: new rip/breeze/inject/ö
      // 069: dup
      // 06a: iload 2
      // 06b: aload 3
      // 06c: aload 0
      // 06d: lload 15
      // 06f: aload 6
      // 071: bipush 2
      // 072: anewarray 60
      // 075: dup_x1
      // 076: swap
      // 077: bipush 1
      // 078: swap
      // 079: aastore
      // 07a: dup_x2
      // 07b: dup_x2
      // 07c: pop
      // 07d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 080: bipush 0
      // 081: swap
      // 082: aastore
      // 083: invokevirtual rip/breeze/inject/BreezeClass12.method_002 ([Ljava/lang/Object;)[Lrip/breeze/inject/ճ;
      // 086: aload 0
      // 087: lload 15
      // 089: aload 7
      // 08b: bipush 2
      // 08c: anewarray 60
      // 08f: dup_x1
      // 090: swap
      // 091: bipush 1
      // 092: swap
      // 093: aastore
      // 094: dup_x2
      // 095: dup_x2
      // 096: pop
      // 097: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09a: bipush 0
      // 09b: swap
      // 09c: aastore
      // 09d: invokevirtual rip/breeze/inject/BreezeClass12.method_002 ([Ljava/lang/Object;)[Lrip/breeze/inject/ճ;
      // 0a0: lload 13
      // 0a2: aload 8
      // 0a4: aload 9
      // 0a6: invokespecial rip/breeze/inject/ö.<init> (ILrip/breeze/inject/և;[Lrip/breeze/inject/ճ;[Lrip/breeze/inject/ճ;J[ILjava/lang/String;)V
      // 0a9: astore 17
      // 0ab: istore 18
      // 0ad: iload 18
      // 0af: ifeq 0eb
      // 0b2: iload 10
      // 0b4: ifeq 0f7
      // 0b7: goto 0be
      // 0ba: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 0c3: lload 11
      // 0c5: aload 17
      // 0c7: bipush 3
      // 0c8: anewarray 60
      // 0cb: dup_x1
      // 0cc: swap
      // 0cd: bipush 2
      // 0ce: swap
      // 0cf: aastore
      // 0d0: dup_x2
      // 0d1: dup_x2
      // 0d2: pop
      // 0d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 0e1: putfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 0e4: goto 0eb
      // 0e7: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ea: athrow
      // 0eb: lload 4
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 11d
      // 0f2: iload 18
      // 0f4: ifne 124
      // 0f7: aload 0
      // 0f8: aload 0
      // 0f9: getfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 0fc: lload 11
      // 0fe: aload 17
      // 100: bipush 3
      // 101: anewarray 60
      // 104: dup_x1
      // 105: swap
      // 106: bipush 2
      // 107: swap
      // 108: aastore
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 1
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: bipush 0
      // 115: swap
      // 116: aastore
      // 117: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 11a: putfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 11d: goto 124
      // 120: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 123: athrow
      // 124: aload 17
      // 126: areturn
      // try (106 -> 110): 111 java/lang/IllegalStateException
      // try (108 -> 139): 140 java/lang/IllegalStateException
      // try (142 -> 174): 175 java/lang/IllegalStateException
   }

   public void invoke_29(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      ª var5 = (ª)var1[2];
      long var6 = var2 ^ 125165059904574L;
      long var8 = var2 ^ 102970240066098L;
      this.թ_ê.method_012(new Object[]{new ձ(var4, this.getՃ(new Object[]{var6, var5})), var8});
   }

   public void invoke_30(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      this.int_è = var4;
      this.int_ç = var5;
   }

   public void invoke_31(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   protected ճ getՃ(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast rip/breeze/inject/ª
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/inject/BreezeClass12.encKey_C J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 1d: istore 5
      // 1f: aload 4
      // 21: getfield rip/breeze/inject/ª.object_î_2 Ljava/lang/Object;
      // 24: iload 5
      // 26: ifne 4e
      // 29: instanceof rip/breeze/inject/ճ
      // 2c: ifne 49
      // 2f: goto 36
      // 32: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 35: athrow
      // 36: aload 4
      // 38: new rip/breeze/inject/ճ
      // 3b: dup
      // 3c: invokespecial rip/breeze/inject/ճ.<init> ()V
      // 3f: putfield rip/breeze/inject/ª.object_î_2 Ljava/lang/Object;
      // 42: goto 49
      // 45: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48: athrow
      // 49: aload 4
      // 4b: getfield rip/breeze/inject/ª.object_î_2 Ljava/lang/Object;
      // 4e: checkcast rip/breeze/inject/ճ
      // 51: areturn
      // try (19 -> 25): 26 java/lang/IllegalStateException
      // try (23 -> 33): 34 java/lang/IllegalStateException
   }

   private ճ[] invoke_2(Object[] var1) {
      long var2 = (Long)var1[0];
      ª[] var4 = (ª[])var1[1];
      var2 = encKey_C ^ var2;
      long var5 = var2 ^ 22755083745303L;
      byte var10000 = checkCondition();
      ճ[] var7 = new ճ[var4.length];
      int var8 = 0;
      int var9 = var4.length;
      byte var10 = var10000;

      label33:
      while (var8 < var9) {
         do {
            try {
               int var10001 = var10;
               if (var2 > 0L) {
                  if (var10 == 0) {
                     return var7;
                  }

                  var10001 = var8;
               }

               var7[var10001] = this.getՃ(new Object[]{var5, var4[var8]});
               var8++;
               if (var10 != 0) {
                  continue label33;
               }
            } catch (IllegalStateException var11) {
               throw getIllegalStateException(var11);
            }
         } while (var2 < 0L);

         return var7;
      }

      return var7;
   }

   private Object[] invoke_3(Object[] var1) {
      Object[] var2 = (Object[])var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_C ^ var3;
      long var5 = var3 ^ 118653872375544L;
      Object[] var7 = new Object[var2.length];
      byte var10000 = checkCondition();
      int var8 = 0;
      byte var9 = var10000;
      int var10 = var2.length;

      while (true) {
         if (var8 < var10) {
            var14 = var2;
            int var10001 = var9;
            if (var3 > 0L) {
               if (var9 == 0) {
                  break;
               }

               var10001 = var8;
            }

            Object var11 = var2[var10001];

            label38: {
               label37: {
                  label36: {
                     try {
                        var10000 = var9;
                        if (var3 < 0L) {
                           break label38;
                        }

                        if (var9 == 0) {
                           break label37;
                        }

                        if (!(var11 instanceof ª)) {
                           break label36;
                        }
                     } catch (IllegalStateException var12) {
                        throw getIllegalStateException(var12);
                     }

                     var11 = this.getՃ(new Object[]{var5, (ª)var11});
                  }

                  var7[var8] = var11;
                  var8++;
               }

               var10000 = var9;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         var14 = var7;
         break;
      }

      return var14;
   }

   public void calculate(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: getstatic rip/breeze/inject/BreezeClass12.encKey_C J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 7537131954094
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 138808976395753
      // 029: lxor
      // 02a: lstore 7
      // 02c: pop2
      // 02d: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 030: istore 9
      // 032: iload 4
      // 034: ldc_w 262144
      // 037: iload 9
      // 039: ifne 46e
      // 03c: if_icmpne 469
      // 03f: goto 046
      // 042: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 045: athrow
      // 046: aload 0
      // 047: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 04a: iload 9
      // 04c: ifne 095
      // 04f: goto 056
      // 052: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 055: athrow
      // 056: ifnull 091
      // 059: goto 060
      // 05c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 064: iload 9
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: iflt 097
      // 06c: ifne 095
      // 06f: goto 076
      // 072: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 075: athrow
      // 076: invokeinterface java/util/List.isEmpty ()Z 1
      // 07b: ifne 091
      // 07e: goto 085
      // 081: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 084: athrow
      // 085: new rip/breeze/inject/ԍ
      // 088: dup
      // 089: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 08c: athrow
      // 08d: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 090: athrow
      // 091: aload 0
      // 092: getfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 095: iload 9
      // 097: ifne 0d9
      // 09a: ifnull 0d5
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 0a8: iload 9
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 0db
      // 0b0: ifne 0d9
      // 0b3: goto 0ba
      // 0b6: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b9: athrow
      // 0ba: invokeinterface java/util/List.isEmpty ()Z 1
      // 0bf: ifne 0d5
      // 0c2: goto 0c9
      // 0c5: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c8: athrow
      // 0c9: new rip/breeze/inject/ԍ
      // 0cc: dup
      // 0cd: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 0d0: athrow
      // 0d1: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: getfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // 0d9: iload 9
      // 0db: ifne 123
      // 0de: ifnull 113
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: getfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // 0ec: iload 9
      // 0ee: ifne 123
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f7: athrow
      // 0f8: invokeinterface java/util/List.isEmpty ()Z 1
      // 0fd: ifne 113
      // 100: goto 107
      // 103: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 106: athrow
      // 107: new rip/breeze/inject/ԍ
      // 10a: dup
      // 10b: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 10e: athrow
      // 10f: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 112: athrow
      // 113: aload 0
      // 114: iload 9
      // 116: ifne 1ef
      // 119: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 11c: goto 123
      // 11f: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 122: athrow
      // 123: ifnull 1e8
      // 126: aload 0
      // 127: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 12a: invokeinterface java/util/List.size ()I 1
      // 12f: bipush 1
      // 130: isub
      // 131: istore 10
      // 133: iload 10
      // 135: iflt 1e8
      // 138: aload 0
      // 139: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 13c: iload 10
      // 13e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 143: checkcast rip/breeze/inject/ա
      // 146: astore 11
      // 148: aload 11
      // 14a: getfield rip/breeze/inject/ա.list_û_2 Ljava/util/List;
      // 14d: iload 9
      // 14f: lload 2
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 15a
      // 155: ifne 3e5
      // 158: iload 9
      // 15a: ifne 1a5
      // 15d: goto 164
      // 160: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 163: athrow
      // 164: ifnull 1a0
      // 167: goto 16e
      // 16a: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16d: athrow
      // 16e: aload 11
      // 170: getfield rip/breeze/inject/ա.list_û_2 Ljava/util/List;
      // 173: iload 9
      // 175: lload 2
      // 176: lconst_0
      // 177: lcmp
      // 178: iflt 1ad
      // 17b: ifne 1a5
      // 17e: goto 185
      // 181: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 184: athrow
      // 185: invokeinterface java/util/List.isEmpty ()Z 1
      // 18a: ifne 1a0
      // 18d: goto 194
      // 190: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 193: athrow
      // 194: new rip/breeze/inject/ԍ
      // 197: dup
      // 198: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 19b: athrow
      // 19c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 19f: athrow
      // 1a0: aload 11
      // 1a2: getfield rip/breeze/inject/ա.list_ú_2 Ljava/util/List;
      // 1a5: lload 2
      // 1a6: lconst_0
      // 1a7: lcmp
      // 1a8: ifle 1c6
      // 1ab: iload 9
      // 1ad: ifne 1c6
      // 1b0: ifnull 1e0
      // 1b3: goto 1ba
      // 1b6: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b9: athrow
      // 1ba: aload 11
      // 1bc: getfield rip/breeze/inject/ա.list_ú_2 Ljava/util/List;
      // 1bf: goto 1c6
      // 1c2: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1c5: athrow
      // 1c6: invokeinterface java/util/List.isEmpty ()Z 1
      // 1cb: lload 2
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: ifle 1e5
      // 1d1: ifne 1e0
      // 1d4: new rip/breeze/inject/ԍ
      // 1d7: dup
      // 1d8: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 1db: athrow
      // 1dc: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1df: athrow
      // 1e0: iinc 10 -1
      // 1e3: iload 9
      // 1e5: ifeq 133
      // 1e8: lload 2
      // 1e9: lconst_0
      // 1ea: lcmp
      // 1eb: ifle 50c
      // 1ee: aload 0
      // 1ef: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 1f2: bipush 0
      // 1f3: anewarray 60
      // 1f6: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 1f9: bipush 1
      // 1fa: isub
      // 1fb: istore 10
      // 1fd: iload 10
      // 1ff: iflt 3db
      // 202: aload 0
      // 203: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 206: iload 10
      // 208: lload 7
      // 20a: bipush 2
      // 20b: anewarray 60
      // 20e: dup_x2
      // 20f: dup_x2
      // 210: pop
      // 211: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 214: bipush 1
      // 215: swap
      // 216: aastore
      // 217: dup_x1
      // 218: swap
      // 219: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21c: bipush 0
      // 21d: swap
      // 21e: aastore
      // 21f: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 222: astore 11
      // 224: aload 11
      // 226: getfield rip/breeze/inject/ջ.list_í_2 Ljava/util/List;
      // 229: iload 9
      // 22b: lload 2
      // 22c: lconst_0
      // 22d: lcmp
      // 22e: ifle 3e7
      // 231: ifne 3e5
      // 234: iload 9
      // 236: ifne 28d
      // 239: goto 240
      // 23c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 23f: athrow
      // 240: ifnull 27c
      // 243: goto 24a
      // 246: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 249: athrow
      // 24a: aload 11
      // 24c: getfield rip/breeze/inject/ջ.list_í_2 Ljava/util/List;
      // 24f: lload 2
      // 250: lconst_0
      // 251: lcmp
      // 252: iflt 28d
      // 255: iload 9
      // 257: ifne 28d
      // 25a: goto 261
      // 25d: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 260: athrow
      // 261: invokeinterface java/util/List.isEmpty ()Z 1
      // 266: ifne 27c
      // 269: goto 270
      // 26c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 26f: athrow
      // 270: new rip/breeze/inject/ԍ
      // 273: dup
      // 274: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 277: athrow
      // 278: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 27b: athrow
      // 27c: aload 11
      // 27e: iload 9
      // 280: ifne 2ca
      // 283: getfield rip/breeze/inject/ջ.list_ì_2 Ljava/util/List;
      // 286: goto 28d
      // 289: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 28c: athrow
      // 28d: lload 2
      // 28e: lconst_0
      // 28f: lcmp
      // 290: ifle 29b
      // 293: ifnull 2c8
      // 296: aload 11
      // 298: getfield rip/breeze/inject/ջ.list_ì_2 Ljava/util/List;
      // 29b: invokeinterface java/util/List.isEmpty ()Z 1
      // 2a0: iload 9
      // 2a2: lload 2
      // 2a3: lconst_0
      // 2a4: lcmp
      // 2a5: ifle 2d5
      // 2a8: ifne 2cd
      // 2ab: goto 2b2
      // 2ae: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b1: athrow
      // 2b2: ifne 2c8
      // 2b5: goto 2bc
      // 2b8: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2bb: athrow
      // 2bc: new rip/breeze/inject/ԍ
      // 2bf: dup
      // 2c0: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 2c3: athrow
      // 2c4: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2c7: athrow
      // 2c8: aload 11
      // 2ca: instanceof rip/breeze/inject/կ
      // 2cd: lload 2
      // 2ce: lconst_0
      // 2cf: lcmp
      // 2d0: iflt 349
      // 2d3: iload 9
      // 2d5: ifne 349
      // 2d8: ifeq 331
      // 2db: goto 2e2
      // 2de: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2e1: athrow
      // 2e2: aload 11
      // 2e4: checkcast rip/breeze/inject/կ
      // 2e7: getfield rip/breeze/inject/կ.bool_ä_2 Z
      // 2ea: istore 12
      // 2ec: iload 12
      // 2ee: aload 11
      // 2f0: getfield rip/breeze/inject/ջ.int_î_2 I
      // 2f3: iload 9
      // 2f5: lload 2
      // 2f6: lconst_0
      // 2f7: lcmp
      // 2f8: iflt 301
      // 2fb: ifne 313
      // 2fe: sipush 185
      // 301: if_icmpne 316
      // 304: goto 30b
      // 307: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 30a: athrow
      // 30b: bipush 1
      // 30c: goto 313
      // 30f: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 312: athrow
      // 313: goto 317
      // 316: bipush 0
      // 317: if_icmpeq 326
      // 31a: new rip/breeze/inject/ԍ
      // 31d: dup
      // 31e: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 321: athrow
      // 322: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 325: athrow
      // 326: iload 9
      // 328: lload 2
      // 329: lconst_0
      // 32a: lcmp
      // 32b: ifle 3d8
      // 32e: ifeq 3d3
      // 331: aload 11
      // 333: iload 9
      // 335: ifne 361
      // 338: goto 33f
      // 33b: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 33e: athrow
      // 33f: instanceof rip/breeze/inject/ղ
      // 342: goto 349
      // 345: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 348: athrow
      // 349: lload 2
      // 34a: lconst_0
      // 34b: lcmp
      // 34c: ifle 3d8
      // 34f: ifeq 3d3
      // 352: aload 11
      // 354: checkcast rip/breeze/inject/ղ
      // 357: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // 35a: goto 361
      // 35d: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 360: athrow
      // 361: astore 12
      // 363: aload 12
      // 365: instanceof rip/breeze/inject/º
      // 368: iload 9
      // 36a: lload 2
      // 36b: lconst_0
      // 36c: lcmp
      // 36d: ifle 38b
      // 370: ifne 389
      // 373: ifne 3c7
      // 376: goto 37d
      // 379: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 37c: athrow
      // 37d: aload 12
      // 37f: instanceof rip/breeze/inject/MathUtil3
      // 382: goto 389
      // 385: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 388: athrow
      // 389: iload 9
      // 38b: lload 2
      // 38c: lconst_0
      // 38d: lcmp
      // 38e: ifle 3c4
      // 391: ifne 3bc
      // 394: ifeq 3d3
      // 397: goto 39e
      // 39a: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 39d: athrow
      // 39e: aload 12
      // 3a0: checkcast rip/breeze/inject/MathUtil3
      // 3a3: lload 5
      // 3a5: bipush 1
      // 3a6: anewarray 60
      // 3a9: dup_x2
      // 3aa: dup_x2
      // 3ab: pop
      // 3ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3af: bipush 0
      // 3b0: swap
      // 3b1: aastore
      // 3b2: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 3b5: goto 3bc
      // 3b8: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3bb: athrow
      // 3bc: lload 2
      // 3bd: lconst_0
      // 3be: lcmp
      // 3bf: iflt 3d8
      // 3c2: bipush 11
      // 3c4: if_icmpne 3d3
      // 3c7: new rip/breeze/inject/ԍ
      // 3ca: dup
      // 3cb: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 3ce: athrow
      // 3cf: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3d2: athrow
      // 3d3: iinc 10 -1
      // 3d6: iload 9
      // 3d8: ifeq 1fd
      // 3db: aload 0
      // 3dc: lload 2
      // 3dd: lconst_0
      // 3de: lcmp
      // 3df: iflt 203
      // 3e2: getfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 3e5: iload 9
      // 3e7: ifne 429
      // 3ea: ifnull 425
      // 3ed: goto 3f4
      // 3f0: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f3: athrow
      // 3f4: aload 0
      // 3f5: getfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 3f8: iload 9
      // 3fa: lload 2
      // 3fb: lconst_0
      // 3fc: lcmp
      // 3fd: iflt 431
      // 400: ifne 429
      // 403: goto 40a
      // 406: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 409: athrow
      // 40a: invokeinterface java/util/List.isEmpty ()Z 1
      // 40f: ifne 425
      // 412: goto 419
      // 415: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 418: athrow
      // 419: new rip/breeze/inject/ԍ
      // 41c: dup
      // 41d: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 420: athrow
      // 421: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 424: athrow
      // 425: aload 0
      // 426: getfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 429: lload 2
      // 42a: lconst_0
      // 42b: lcmp
      // 42c: ifle 449
      // 42f: iload 9
      // 431: ifne 449
      // 434: ifnull 469
      // 437: goto 43e
      // 43a: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 43d: athrow
      // 43e: aload 0
      // 43f: getfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 442: goto 449
      // 445: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 448: athrow
      // 449: invokeinterface java/util/List.isEmpty ()Z 1
      // 44e: iload 9
      // 450: ifne 46b
      // 453: ifne 469
      // 456: goto 45d
      // 459: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45c: athrow
      // 45d: new rip/breeze/inject/ԍ
      // 460: dup
      // 461: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 464: athrow
      // 465: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 468: athrow
      // 469: iload 4
      // 46b: ldc_w 458752
      // 46e: iload 9
      // 470: ifne 490
      // 473: if_icmpge 50c
      // 476: goto 47d
      // 479: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 47c: athrow
      // 47d: aload 0
      // 47e: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 481: bipush 0
      // 482: anewarray 60
      // 485: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 488: bipush 1
      // 489: goto 490
      // 48c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48f: athrow
      // 490: isub
      // 491: istore 10
      // 493: iload 10
      // 495: iflt 50c
      // 498: aload 0
      // 499: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 49c: iload 10
      // 49e: lload 7
      // 4a0: bipush 2
      // 4a1: anewarray 60
      // 4a4: dup_x2
      // 4a5: dup_x2
      // 4a6: pop
      // 4a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4aa: bipush 1
      // 4ab: swap
      // 4ac: aastore
      // 4ad: dup_x1
      // 4ae: swap
      // 4af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4b2: bipush 0
      // 4b3: swap
      // 4b4: aastore
      // 4b5: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 4b8: astore 11
      // 4ba: iload 9
      // 4bc: lload 2
      // 4bd: lconst_0
      // 4be: lcmp
      // 4bf: ifle 4ca
      // 4c2: ifne 507
      // 4c5: aload 11
      // 4c7: instanceof rip/breeze/inject/ղ
      // 4ca: ifeq 504
      // 4cd: goto 4d4
      // 4d0: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4d3: athrow
      // 4d4: aload 11
      // 4d6: checkcast rip/breeze/inject/ղ
      // 4d9: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // 4dc: astore 12
      // 4de: iload 9
      // 4e0: lload 2
      // 4e1: lconst_0
      // 4e2: lcmp
      // 4e3: iflt 509
      // 4e6: ifne 507
      // 4e9: aload 12
      // 4eb: instanceof rip/breeze/inject/è
      // 4ee: ifeq 504
      // 4f1: goto 4f8
      // 4f4: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f7: athrow
      // 4f8: new rip/breeze/inject/ԍ
      // 4fb: dup
      // 4fc: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 4ff: athrow
      // 500: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 503: athrow
      // 504: iinc 10 -1
      // 507: iload 9
      // 509: ifeq 493
      // 50c: return
      // try (30 -> 35): 36 java/lang/IllegalStateException
      // try (34 -> 42): 43 java/lang/IllegalStateException
      // try (38 -> 46): 47 java/lang/IllegalStateException
      // try (45 -> 57): 58 java/lang/IllegalStateException
      // try (49 -> 62): 63 java/lang/IllegalStateException
      // try (60 -> 69): 69 java/lang/IllegalStateException
      // try (73 -> 76): 77 java/lang/IllegalStateException
      // try (75 -> 87): 88 java/lang/IllegalStateException
      // try (79 -> 92): 93 java/lang/IllegalStateException
      // try (90 -> 99): 99 java/lang/IllegalStateException
      // try (103 -> 106): 107 java/lang/IllegalStateException
      // try (105 -> 113): 114 java/lang/IllegalStateException
      // try (109 -> 118): 119 java/lang/IllegalStateException
      // try (116 -> 125): 125 java/lang/IllegalStateException
      // try (127 -> 131): 132 java/lang/IllegalStateException
      // try (149 -> 159): 160 java/lang/IllegalStateException
      // try (157 -> 163): 164 java/lang/IllegalStateException
      // try (162 -> 174): 175 java/lang/IllegalStateException
      // try (166 -> 179): 180 java/lang/IllegalStateException
      // try (177 -> 186): 186 java/lang/IllegalStateException
      // try (190 -> 197): 198 java/lang/IllegalStateException
      // try (196 -> 202): 203 java/lang/IllegalStateException
      // try (205 -> 215): 215 java/lang/IllegalStateException
      // try (255 -> 265): 266 java/lang/IllegalStateException
      // try (263 -> 269): 270 java/lang/IllegalStateException
      // try (268 -> 280): 281 java/lang/IllegalStateException
      // try (272 -> 285): 286 java/lang/IllegalStateException
      // try (283 -> 292): 292 java/lang/IllegalStateException
      // try (294 -> 298): 299 java/lang/IllegalStateException
      // try (301 -> 315): 316 java/lang/IllegalStateException
      // try (306 -> 319): 320 java/lang/IllegalStateException
      // try (318 -> 326): 326 java/lang/IllegalStateException
      // try (330 -> 337): 338 java/lang/IllegalStateException
      // try (344 -> 355): 356 java/lang/IllegalStateException
      // try (353 -> 359): 360 java/lang/IllegalStateException
      // try (364 -> 369): 369 java/lang/IllegalStateException
      // try (371 -> 380): 381 java/lang/IllegalStateException
      // try (377 -> 384): 385 java/lang/IllegalStateException
      // try (387 -> 395): 396 java/lang/IllegalStateException
      // try (399 -> 408): 409 java/lang/IllegalStateException
      // try (407 -> 413): 414 java/lang/IllegalStateException
      // try (416 -> 423): 424 java/lang/IllegalStateException
      // try (422 -> 439): 440 java/lang/IllegalStateException
      // try (442 -> 452): 452 java/lang/IllegalStateException
      // try (463 -> 466): 467 java/lang/IllegalStateException
      // try (465 -> 477): 478 java/lang/IllegalStateException
      // try (469 -> 482): 483 java/lang/IllegalStateException
      // try (480 -> 489): 489 java/lang/IllegalStateException
      // try (493 -> 500): 501 java/lang/IllegalStateException
      // try (499 -> 505): 506 java/lang/IllegalStateException
      // try (508 -> 512): 513 java/lang/IllegalStateException
      // try (511 -> 519): 519 java/lang/IllegalStateException
      // try (523 -> 526): 527 java/lang/IllegalStateException
      // try (525 -> 535): 536 java/lang/IllegalStateException
      // try (563 -> 572): 573 java/lang/IllegalStateException
      // try (579 -> 588): 589 java/lang/IllegalStateException
      // try (585 -> 595): 595 java/lang/IllegalStateException
   }

   @Override
   public void processAll_5(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/î
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/BreezeClass12.encKey_C J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 104605729252870
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 55591642364690
      // 25: lxor
      // 26: lstore 7
      // 28: pop2
      // 29: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 2c: istore 9
      // 2e: aload 0
      // 2f: getfield rip/breeze/inject/BreezeClass12.list_ö Ljava/util/List;
      // 32: iload 9
      // 34: ifeq 4d
      // 37: ifnonnull 49
      // 3a: goto 41
      // 3d: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 40: athrow
      // 41: aconst_null
      // 42: goto 59
      // 45: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield rip/breeze/inject/BreezeClass12.list_ö Ljava/util/List;
      // 4d: bipush 0
      // 4e: anewarray 133
      // 51: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 56: checkcast [Ljava/lang/String;
      // 59: astore 10
      // 5b: aload 2
      // 5c: aload 0
      // 5d: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 60: aload 0
      // 61: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 64: lload 7
      // 66: dup2_x1
      // 67: pop2
      // 68: aload 0
      // 69: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 6c: aload 0
      // 6d: getfield rip/breeze/inject/BreezeClass12.string_ø Ljava/lang/String;
      // 70: aload 10
      // 72: bipush 6
      // 74: anewarray 60
      // 77: dup_x1
      // 78: swap
      // 79: bipush 5
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 4
      // 7f: swap
      // 80: aastore
      // 81: dup_x1
      // 82: swap
      // 83: bipush 3
      // 84: swap
      // 85: aastore
      // 86: dup_x1
      // 87: swap
      // 88: bipush 2
      // 89: swap
      // 8a: aastore
      // 8b: dup_x2
      // 8c: dup_x2
      // 8d: pop
      // 8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 91: bipush 1
      // 92: swap
      // 93: aastore
      // 94: dup_x1
      // 95: swap
      // 96: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 99: bipush 0
      // 9a: swap
      // 9b: aastore
      // 9c: invokevirtual rip/breeze/inject/î.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 9f: astore 11
      // a1: lload 3
      // a2: lconst_0
      // a3: lcmp
      // a4: ifle c6
      // a7: aload 11
      // a9: ifnull cd
      // ac: aload 0
      // ad: lload 5
      // af: aload 11
      // b1: bipush 2
      // b2: anewarray 60
      // b5: dup_x1
      // b6: swap
      // b7: bipush 1
      // b8: swap
      // b9: aastore
      // ba: dup_x2
      // bb: dup_x2
      // bc: pop
      // bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c0: bipush 0
      // c1: swap
      // c2: aastore
      // c3: invokevirtual rip/breeze/inject/BreezeClass12.toggle ([Ljava/lang/Object;)V
      // c6: goto cd
      // c9: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // cc: athrow
      // cd: return
      // try (29 -> 34): 35 java/lang/IllegalStateException
      // try (33 -> 39): 39 java/lang/IllegalStateException
      // try (98 -> 122): 123 java/lang/IllegalStateException
   }

   public void toggle(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/Util140
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/BreezeClass12.encKey_C J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 120312808959125
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 47612180158734
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 60049649284410
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 112104064914710
      // 034: lxor
      // 035: lstore 11
      // 037: dup2
      // 038: ldc2_w 66730728888834
      // 03b: lxor
      // 03c: lstore 13
      // 03e: dup2
      // 03f: ldc2_w 58564286201096
      // 042: lxor
      // 043: lstore 15
      // 045: dup2
      // 046: ldc2_w 130772896136939
      // 049: lxor
      // 04a: lstore 17
      // 04c: dup2
      // 04d: ldc2_w 23991052478162
      // 050: lxor
      // 051: lstore 19
      // 053: dup2
      // 054: ldc2_w 76222890915428
      // 057: lxor
      // 058: lstore 21
      // 05a: dup2
      // 05b: ldc2_w 47171632395562
      // 05e: lxor
      // 05f: lstore 23
      // 061: dup2
      // 062: ldc2_w 20736759377429
      // 065: lxor
      // 066: lstore 25
      // 068: dup2
      // 069: ldc2_w 78970320235170
      // 06c: lxor
      // 06d: lstore 27
      // 06f: dup2
      // 070: ldc2_w 73434934847373
      // 073: lxor
      // 074: lstore 29
      // 076: dup2
      // 077: ldc2_w 100234624707485
      // 07a: lxor
      // 07b: lstore 31
      // 07d: dup2
      // 07e: ldc2_w 84084666541152
      // 081: lxor
      // 082: lstore 33
      // 084: dup2
      // 085: ldc2_w 81346297857874
      // 088: lxor
      // 089: lstore 35
      // 08b: dup2
      // 08c: ldc2_w 130207010789828
      // 08f: lxor
      // 090: lstore 37
      // 092: dup2
      // 093: ldc2_w 108266951114269
      // 096: lxor
      // 097: lstore 39
      // 099: dup2
      // 09a: ldc2_w 105703205194834
      // 09d: lxor
      // 09e: lstore 41
      // 0a0: pop2
      // 0a1: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 0a4: istore 43
      // 0a6: aload 0
      // 0a7: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 0aa: iload 43
      // 0ac: ifne 12b
      // 0af: ifnull 115
      // 0b2: goto 0b9
      // 0b5: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b8: athrow
      // 0b9: bipush 0
      // 0ba: istore 44
      // 0bc: aload 0
      // 0bd: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 0c0: invokeinterface java/util/List.size ()I 1
      // 0c5: istore 45
      // 0c7: iload 44
      // 0c9: iload 45
      // 0cb: if_icmpge 115
      // 0ce: aload 0
      // 0cf: getfield rip/breeze/inject/BreezeClass12.list_õ Ljava/util/List;
      // 0d2: iload 44
      // 0d4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d9: checkcast rip/breeze/inject/բ
      // 0dc: lload 21
      // 0de: aload 4
      // 0e0: bipush 2
      // 0e1: anewarray 60
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 1
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x2
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: invokevirtual rip/breeze/inject/բ.method_001 ([Ljava/lang/Object;)V
      // 0f5: iinc 44 1
      // 0f8: iload 43
      // 0fa: lload 2
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: iflt 105
      // 100: ifne 199
      // 103: iload 43
      // 105: ifeq 0c7
      // 108: lload 2
      // 109: lconst_0
      // 10a: lcmp
      // 10b: ifle 0f8
      // 10e: goto 115
      // 111: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 114: athrow
      // 115: aload 0
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 19a
      // 11c: iload 43
      // 11e: ifne 19a
      // 121: getfield rip/breeze/inject/BreezeClass12.object_ï Ljava/lang/Object;
      // 124: goto 12b
      // 127: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 12a: athrow
      // 12b: ifnull 199
      // 12e: aload 4
      // 130: lload 7
      // 132: bipush 1
      // 133: anewarray 60
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: invokevirtual rip/breeze/inject/Util140.getÜ ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 142: astore 44
      // 144: aload 44
      // 146: aconst_null
      // 147: aload 0
      // 148: getfield rip/breeze/inject/BreezeClass12.object_ï Ljava/lang/Object;
      // 14b: lload 15
      // 14d: dup2_x1
      // 14e: pop2
      // 14f: bipush 4
      // 150: anewarray 60
      // 153: dup_x1
      // 154: swap
      // 155: bipush 3
      // 156: swap
      // 157: aastore
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 2
      // 15f: swap
      // 160: aastore
      // 161: dup_x1
      // 162: swap
      // 163: bipush 1
      // 164: swap
      // 165: aastore
      // 166: lload 2
      // 167: lconst_0
      // 168: lcmp
      // 169: ifle 196
      // 16c: dup_x1
      // 16d: swap
      // 16e: bipush 0
      // 16f: swap
      // 170: aastore
      // 171: invokestatic rip/breeze/inject/ù.method_003 ([Ljava/lang/Object;)V
      // 174: aload 44
      // 176: iload 43
      // 178: ifne 187
      // 17b: ifnull 199
      // 17e: goto 185
      // 181: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 184: athrow
      // 185: aload 44
      // 187: lload 23
      // 189: bipush 1
      // 18a: anewarray 60
      // 18d: dup_x2
      // 18e: dup_x2
      // 18f: pop
      // 190: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 193: bipush 0
      // 194: swap
      // 195: aastore
      // 196: invokevirtual rip/breeze/inject/ü.method_005 ([Ljava/lang/Object;)V
      // 199: aload 0
      // 19a: getfield rip/breeze/inject/BreezeClass12.list_ô Ljava/util/List;
      // 19d: iload 43
      // 19f: lload 2
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: ifle 23f
      // 1a5: ifne 23d
      // 1a8: ifnull 239
      // 1ab: goto 1b2
      // 1ae: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b1: athrow
      // 1b2: bipush 0
      // 1b3: istore 44
      // 1b5: aload 0
      // 1b6: getfield rip/breeze/inject/BreezeClass12.list_ô Ljava/util/List;
      // 1b9: invokeinterface java/util/List.size ()I 1
      // 1be: istore 45
      // 1c0: iload 44
      // 1c2: iload 45
      // 1c4: if_icmpge 239
      // 1c7: aload 0
      // 1c8: lload 2
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: iflt 2da
      // 1ce: getfield rip/breeze/inject/BreezeClass12.list_ô Ljava/util/List;
      // 1d1: iload 44
      // 1d3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d8: checkcast rip/breeze/inject/ù
      // 1db: astore 46
      // 1dd: aload 46
      // 1df: aload 4
      // 1e1: aload 46
      // 1e3: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 1e6: bipush 1
      // 1e7: lload 33
      // 1e9: bipush 3
      // 1ea: anewarray 60
      // 1ed: dup_x2
      // 1ee: dup_x2
      // 1ef: pop
      // 1f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f3: bipush 2
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1fb: bipush 1
      // 1fc: swap
      // 1fd: aastore
      // 1fe: dup_x1
      // 1ff: swap
      // 200: bipush 0
      // 201: swap
      // 202: aastore
      // 203: invokevirtual rip/breeze/inject/Util140.getÜ_2 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 206: lload 13
      // 208: dup2_x1
      // 209: pop2
      // 20a: bipush 2
      // 20b: anewarray 60
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 1
      // 211: swap
      // 212: aastore
      // 213: dup_x2
      // 214: dup_x2
      // 215: pop
      // 216: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 219: bipush 0
      // 21a: swap
      // 21b: aastore
      // 21c: invokevirtual rip/breeze/inject/ù.method_002 ([Ljava/lang/Object;)V
      // 21f: iinc 44 1
      // 222: iload 43
      // 224: ifne 2d9
      // 227: iload 43
      // 229: ifeq 1c0
      // 22c: lload 2
      // 22d: lconst_0
      // 22e: lcmp
      // 22f: iflt 222
      // 232: goto 239
      // 235: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 238: athrow
      // 239: aload 0
      // 23a: getfield rip/breeze/inject/BreezeClass12.list_ó Ljava/util/List;
      // 23d: iload 43
      // 23f: lload 2
      // 240: lconst_0
      // 241: lcmp
      // 242: ifle 2df
      // 245: ifne 2dd
      // 248: ifnull 2d9
      // 24b: goto 252
      // 24e: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 251: athrow
      // 252: bipush 0
      // 253: istore 44
      // 255: aload 0
      // 256: getfield rip/breeze/inject/BreezeClass12.list_ó Ljava/util/List;
      // 259: invokeinterface java/util/List.size ()I 1
      // 25e: istore 45
      // 260: iload 44
      // 262: iload 45
      // 264: if_icmpge 2d9
      // 267: aload 0
      // 268: getfield rip/breeze/inject/BreezeClass12.list_ó Ljava/util/List;
      // 26b: iload 44
      // 26d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 272: checkcast rip/breeze/inject/ù
      // 275: astore 46
      // 277: aload 46
      // 279: aload 4
      // 27b: aload 46
      // 27d: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 280: bipush 0
      // 281: lload 33
      // 283: bipush 3
      // 284: anewarray 60
      // 287: dup_x2
      // 288: dup_x2
      // 289: pop
      // 28a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28d: bipush 2
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 295: bipush 1
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 0
      // 29b: swap
      // 29c: aastore
      // 29d: invokevirtual rip/breeze/inject/Util140.getÜ_2 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 2a0: lload 13
      // 2a2: dup2_x1
      // 2a3: pop2
      // 2a4: bipush 2
      // 2a5: anewarray 60
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: bipush 1
      // 2ab: swap
      // 2ac: aastore
      // 2ad: dup_x2
      // 2ae: dup_x2
      // 2af: pop
      // 2b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b3: bipush 0
      // 2b4: swap
      // 2b5: aastore
      // 2b6: invokevirtual rip/breeze/inject/ù.method_002 ([Ljava/lang/Object;)V
      // 2b9: iinc 44 1
      // 2bc: lload 2
      // 2bd: lconst_0
      // 2be: lcmp
      // 2bf: ifle 38a
      // 2c2: iload 43
      // 2c4: ifne 38a
      // 2c7: iload 43
      // 2c9: ifeq 260
      // 2cc: lload 2
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: iflt 2bc
      // 2d2: goto 2d9
      // 2d5: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d8: athrow
      // 2d9: aload 0
      // 2da: getfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 2dd: iload 43
      // 2df: ifne 3a0
      // 2e2: ifnull 38a
      // 2e5: goto 2ec
      // 2e8: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2eb: athrow
      // 2ec: bipush 0
      // 2ed: istore 44
      // 2ef: aload 0
      // 2f0: getfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 2f3: invokeinterface java/util/List.size ()I 1
      // 2f8: istore 45
      // 2fa: iload 44
      // 2fc: iload 45
      // 2fe: if_icmpge 38a
      // 301: aload 0
      // 302: getfield rip/breeze/inject/BreezeClass12.list_ò Ljava/util/List;
      // 305: iload 44
      // 307: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 30c: checkcast rip/breeze/inject/ø
      // 30f: astore 46
      // 311: aload 46
      // 313: aload 4
      // 315: aload 46
      // 317: getfield rip/breeze/inject/ø.int_ú I
      // 31a: aload 46
      // 31c: getfield rip/breeze/inject/ø.և_ù Lrip/breeze/inject/և;
      // 31f: aload 46
      // 321: getfield rip/breeze/inject/ø.ü Ljava/lang/String;
      // 324: lload 35
      // 326: bipush 1
      // 327: bipush 5
      // 328: anewarray 60
      // 32b: dup_x1
      // 32c: swap
      // 32d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 330: bipush 4
      // 331: swap
      // 332: aastore
      // 333: dup_x2
      // 334: dup_x2
      // 335: pop
      // 336: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 339: bipush 3
      // 33a: swap
      // 33b: aastore
      // 33c: dup_x1
      // 33d: swap
      // 33e: bipush 2
      // 33f: swap
      // 340: aastore
      // 341: dup_x1
      // 342: swap
      // 343: bipush 1
      // 344: swap
      // 345: aastore
      // 346: dup_x1
      // 347: swap
      // 348: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34b: bipush 0
      // 34c: swap
      // 34d: aastore
      // 34e: invokevirtual rip/breeze/inject/Util140.getÜ_3 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 351: lload 13
      // 353: dup2_x1
      // 354: pop2
      // 355: bipush 2
      // 356: anewarray 60
      // 359: dup_x1
      // 35a: swap
      // 35b: bipush 1
      // 35c: swap
      // 35d: aastore
      // 35e: dup_x2
      // 35f: dup_x2
      // 360: pop
      // 361: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 364: bipush 0
      // 365: swap
      // 366: aastore
      // 367: invokevirtual rip/breeze/inject/ø.ö ([Ljava/lang/Object;)V
      // 36a: iinc 44 1
      // 36d: iload 43
      // 36f: lload 2
      // 370: lconst_0
      // 371: lcmp
      // 372: iflt 37a
      // 375: ifne 441
      // 378: iload 43
      // 37a: ifeq 2fa
      // 37d: lload 2
      // 37e: lconst_0
      // 37f: lcmp
      // 380: iflt 36d
      // 383: goto 38a
      // 386: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 389: athrow
      // 38a: aload 0
      // 38b: iload 43
      // 38d: lload 2
      // 38e: lconst_0
      // 38f: lcmp
      // 390: iflt 444
      // 393: ifne 442
      // 396: getfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // 399: goto 3a0
      // 39c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 39f: athrow
      // 3a0: ifnull 441
      // 3a3: bipush 0
      // 3a4: istore 44
      // 3a6: aload 0
      // 3a7: getfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // 3aa: invokeinterface java/util/List.size ()I 1
      // 3af: istore 45
      // 3b1: iload 44
      // 3b3: iload 45
      // 3b5: if_icmpge 441
      // 3b8: aload 0
      // 3b9: getfield rip/breeze/inject/BreezeClass12.list_ñ Ljava/util/List;
      // 3bc: iload 44
      // 3be: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3c3: checkcast rip/breeze/inject/ø
      // 3c6: astore 46
      // 3c8: aload 46
      // 3ca: aload 4
      // 3cc: aload 46
      // 3ce: getfield rip/breeze/inject/ø.int_ú I
      // 3d1: aload 46
      // 3d3: getfield rip/breeze/inject/ø.և_ù Lrip/breeze/inject/և;
      // 3d6: aload 46
      // 3d8: getfield rip/breeze/inject/ø.ü Ljava/lang/String;
      // 3db: lload 35
      // 3dd: bipush 0
      // 3de: bipush 5
      // 3df: anewarray 60
      // 3e2: dup_x1
      // 3e3: swap
      // 3e4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3e7: bipush 4
      // 3e8: swap
      // 3e9: aastore
      // 3ea: dup_x2
      // 3eb: dup_x2
      // 3ec: pop
      // 3ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f0: bipush 3
      // 3f1: swap
      // 3f2: aastore
      // 3f3: dup_x1
      // 3f4: swap
      // 3f5: bipush 2
      // 3f6: swap
      // 3f7: aastore
      // 3f8: dup_x1
      // 3f9: swap
      // 3fa: bipush 1
      // 3fb: swap
      // 3fc: aastore
      // 3fd: dup_x1
      // 3fe: swap
      // 3ff: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 402: bipush 0
      // 403: swap
      // 404: aastore
      // 405: invokevirtual rip/breeze/inject/Util140.getÜ_3 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 408: lload 13
      // 40a: dup2_x1
      // 40b: pop2
      // 40c: bipush 2
      // 40d: anewarray 60
      // 410: dup_x1
      // 411: swap
      // 412: bipush 1
      // 413: swap
      // 414: aastore
      // 415: dup_x2
      // 416: dup_x2
      // 417: pop
      // 418: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41b: bipush 0
      // 41c: swap
      // 41d: aastore
      // 41e: invokevirtual rip/breeze/inject/ø.ö ([Ljava/lang/Object;)V
      // 421: iinc 44 1
      // 424: iload 43
      // 426: lload 2
      // 427: lconst_0
      // 428: lcmp
      // 429: ifle 431
      // 42c: ifne 48c
      // 42f: iload 43
      // 431: ifeq 3b1
      // 434: lload 2
      // 435: lconst_0
      // 436: lcmp
      // 437: ifle 424
      // 43a: goto 441
      // 43d: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 440: athrow
      // 441: aload 0
      // 442: iload 43
      // 444: lload 2
      // 445: lconst_0
      // 446: lcmp
      // 447: iflt 48f
      // 44a: ifne 48d
      // 44d: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 450: ifle 48c
      // 453: goto 45a
      // 456: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 459: athrow
      // 45a: aload 4
      // 45c: aload 0
      // 45d: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 460: lload 11
      // 462: dup2_x1
      // 463: pop2
      // 464: bipush 1
      // 465: bipush 3
      // 466: anewarray 60
      // 469: dup_x1
      // 46a: swap
      // 46b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 46e: bipush 2
      // 46f: swap
      // 470: aastore
      // 471: dup_x1
      // 472: swap
      // 473: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 476: bipush 1
      // 477: swap
      // 478: aastore
      // 479: dup_x2
      // 47a: dup_x2
      // 47b: pop
      // 47c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47f: bipush 0
      // 480: swap
      // 481: aastore
      // 482: invokevirtual rip/breeze/inject/Util140.processAll_2 ([Ljava/lang/Object;)V
      // 485: goto 48c
      // 488: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48b: athrow
      // 48c: aload 0
      // 48d: iload 43
      // 48f: lload 2
      // 490: lconst_0
      // 491: lcmp
      // 492: iflt 57a
      // 495: ifne 578
      // 498: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 49b: ifnull 571
      // 49e: goto 4a5
      // 4a1: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4a4: athrow
      // 4a5: bipush 0
      // 4a6: istore 44
      // 4a8: aload 0
      // 4a9: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 4ac: arraylength
      // 4ad: istore 45
      // 4af: iload 44
      // 4b1: iload 45
      // 4b3: if_icmpge 571
      // 4b6: aload 0
      // 4b7: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 4ba: iload 44
      // 4bc: aaload
      // 4bd: astore 46
      // 4bf: aload 46
      // 4c1: iload 43
      // 4c3: ifne 6f9
      // 4c6: ifnonnull 4dc
      // 4c9: goto 4d0
      // 4cc: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4cf: athrow
      // 4d0: iload 43
      // 4d2: ifeq 569
      // 4d5: goto 4dc
      // 4d8: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4db: athrow
      // 4dc: bipush 0
      // 4dd: istore 47
      // 4df: aload 46
      // 4e1: invokeinterface java/util/List.size ()I 1
      // 4e6: istore 48
      // 4e8: iload 47
      // 4ea: iload 48
      // 4ec: if_icmpge 569
      // 4ef: aload 46
      // 4f1: iload 47
      // 4f3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4f8: checkcast rip/breeze/inject/ù
      // 4fb: astore 49
      // 4fd: aload 49
      // 4ff: aload 4
      // 501: iload 44
      // 503: aload 49
      // 505: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 508: lload 27
      // 50a: bipush 1
      // 50b: bipush 4
      // 50c: anewarray 60
      // 50f: dup_x1
      // 510: swap
      // 511: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 514: bipush 3
      // 515: swap
      // 516: aastore
      // 517: dup_x2
      // 518: dup_x2
      // 519: pop
      // 51a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51d: bipush 2
      // 51e: swap
      // 51f: aastore
      // 520: dup_x1
      // 521: swap
      // 522: bipush 1
      // 523: swap
      // 524: aastore
      // 525: dup_x1
      // 526: swap
      // 527: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 52a: bipush 0
      // 52b: swap
      // 52c: aastore
      // 52d: invokevirtual rip/breeze/inject/Util140.getÜ_4 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 530: lload 13
      // 532: dup2_x1
      // 533: pop2
      // 534: bipush 2
      // 535: anewarray 60
      // 538: dup_x1
      // 539: swap
      // 53a: bipush 1
      // 53b: swap
      // 53c: aastore
      // 53d: dup_x2
      // 53e: dup_x2
      // 53f: pop
      // 540: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 543: bipush 0
      // 544: swap
      // 545: aastore
      // 546: invokevirtual rip/breeze/inject/ù.method_002 ([Ljava/lang/Object;)V
      // 549: iinc 47 1
      // 54c: iload 43
      // 54e: lload 2
      // 54f: lconst_0
      // 550: lcmp
      // 551: iflt 56e
      // 554: ifne 56c
      // 557: iload 43
      // 559: ifeq 4e8
      // 55c: lload 2
      // 55d: lconst_0
      // 55e: lcmp
      // 55f: ifle 54c
      // 562: goto 569
      // 565: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 568: athrow
      // 569: iinc 44 1
      // 56c: iload 43
      // 56e: ifeq 4af
      // 571: lload 2
      // 572: lconst_0
      // 573: lcmp
      // 574: ifle 758
      // 577: aload 0
      // 578: iload 43
      // 57a: lload 2
      // 57b: lconst_0
      // 57c: lcmp
      // 57d: ifle 5c5
      // 580: ifne 5c3
      // 583: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 586: ifle 5c2
      // 589: goto 590
      // 58c: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 58f: athrow
      // 590: aload 4
      // 592: aload 0
      // 593: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 596: lload 11
      // 598: dup2_x1
      // 599: pop2
      // 59a: bipush 0
      // 59b: bipush 3
      // 59c: anewarray 60
      // 59f: dup_x1
      // 5a0: swap
      // 5a1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5a4: bipush 2
      // 5a5: swap
      // 5a6: aastore
      // 5a7: dup_x1
      // 5a8: swap
      // 5a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5ac: bipush 1
      // 5ad: swap
      // 5ae: aastore
      // 5af: dup_x2
      // 5b0: dup_x2
      // 5b1: pop
      // 5b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b5: bipush 0
      // 5b6: swap
      // 5b7: aastore
      // 5b8: invokevirtual rip/breeze/inject/Util140.processAll_2 ([Ljava/lang/Object;)V
      // 5bb: goto 5c2
      // 5be: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5c1: athrow
      // 5c2: aload 0
      // 5c3: iload 43
      // 5c5: lload 2
      // 5c6: lconst_0
      // 5c7: lcmp
      // 5c8: ifle 6b0
      // 5cb: ifne 6ae
      // 5ce: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 5d1: ifnull 6a7
      // 5d4: goto 5db
      // 5d7: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5da: athrow
      // 5db: bipush 0
      // 5dc: istore 44
      // 5de: aload 0
      // 5df: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 5e2: arraylength
      // 5e3: istore 45
      // 5e5: iload 44
      // 5e7: iload 45
      // 5e9: if_icmpge 6a7
      // 5ec: aload 0
      // 5ed: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 5f0: iload 44
      // 5f2: aaload
      // 5f3: astore 46
      // 5f5: aload 46
      // 5f7: iload 43
      // 5f9: ifne 6f9
      // 5fc: ifnonnull 612
      // 5ff: goto 606
      // 602: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 605: athrow
      // 606: iload 43
      // 608: ifeq 69f
      // 60b: goto 612
      // 60e: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 611: athrow
      // 612: bipush 0
      // 613: istore 47
      // 615: aload 46
      // 617: invokeinterface java/util/List.size ()I 1
      // 61c: istore 48
      // 61e: iload 47
      // 620: iload 48
      // 622: if_icmpge 69f
      // 625: aload 46
      // 627: iload 47
      // 629: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 62e: checkcast rip/breeze/inject/ù
      // 631: astore 49
      // 633: aload 49
      // 635: aload 4
      // 637: iload 44
      // 639: aload 49
      // 63b: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 63e: lload 27
      // 640: bipush 0
      // 641: bipush 4
      // 642: anewarray 60
      // 645: dup_x1
      // 646: swap
      // 647: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 64a: bipush 3
      // 64b: swap
      // 64c: aastore
      // 64d: dup_x2
      // 64e: dup_x2
      // 64f: pop
      // 650: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 653: bipush 2
      // 654: swap
      // 655: aastore
      // 656: dup_x1
      // 657: swap
      // 658: bipush 1
      // 659: swap
      // 65a: aastore
      // 65b: dup_x1
      // 65c: swap
      // 65d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 660: bipush 0
      // 661: swap
      // 662: aastore
      // 663: invokevirtual rip/breeze/inject/Util140.getÜ_4 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 666: lload 13
      // 668: dup2_x1
      // 669: pop2
      // 66a: bipush 2
      // 66b: anewarray 60
      // 66e: dup_x1
      // 66f: swap
      // 670: bipush 1
      // 671: swap
      // 672: aastore
      // 673: dup_x2
      // 674: dup_x2
      // 675: pop
      // 676: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 679: bipush 0
      // 67a: swap
      // 67b: aastore
      // 67c: invokevirtual rip/breeze/inject/ù.method_002 ([Ljava/lang/Object;)V
      // 67f: iinc 47 1
      // 682: iload 43
      // 684: lload 2
      // 685: lconst_0
      // 686: lcmp
      // 687: iflt 6a4
      // 68a: ifne 6a2
      // 68d: iload 43
      // 68f: ifeq 61e
      // 692: lload 2
      // 693: lconst_0
      // 694: lcmp
      // 695: ifle 682
      // 698: goto 69f
      // 69b: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 69e: athrow
      // 69f: iinc 44 1
      // 6a2: iload 43
      // 6a4: ifeq 5e5
      // 6a7: lload 2
      // 6a8: lconst_0
      // 6a9: lcmp
      // 6aa: ifle 758
      // 6ad: aload 0
      // 6ae: iload 43
      // 6b0: lload 2
      // 6b1: lconst_0
      // 6b2: lcmp
      // 6b3: iflt 6e6
      // 6b6: ifne 6e4
      // 6b9: getfield rip/breeze/inject/BreezeClass12.bool_ã Z
      // 6bc: ifeq 6e3
      // 6bf: goto 6c6
      // 6c2: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6c5: athrow
      // 6c6: aload 0
      // 6c7: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 6ca: lload 37
      // 6cc: bipush 1
      // 6cd: anewarray 60
      // 6d0: dup_x2
      // 6d1: dup_x2
      // 6d2: pop
      // 6d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d6: bipush 0
      // 6d7: swap
      // 6d8: aastore
      // 6d9: invokevirtual rip/breeze/inject/թ.method_023 ([Ljava/lang/Object;)V
      // 6dc: goto 6e3
      // 6df: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6e2: athrow
      // 6e3: aload 0
      // 6e4: iload 43
      // 6e6: lload 2
      // 6e7: lconst_0
      // 6e8: lcmp
      // 6e9: ifle 75b
      // 6ec: ifne 759
      // 6ef: getfield rip/breeze/inject/BreezeClass12.list_ð Ljava/util/List;
      // 6f2: goto 6f9
      // 6f5: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6f8: athrow
      // 6f9: ifnull 758
      // 6fc: bipush 0
      // 6fd: istore 44
      // 6ff: aload 0
      // 700: getfield rip/breeze/inject/BreezeClass12.list_ð Ljava/util/List;
      // 703: invokeinterface java/util/List.size ()I 1
      // 708: istore 45
      // 70a: iload 44
      // 70c: iload 45
      // 70e: if_icmpge 758
      // 711: aload 4
      // 713: aload 0
      // 714: getfield rip/breeze/inject/BreezeClass12.list_ð Ljava/util/List;
      // 717: iload 44
      // 719: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 71e: checkcast rip/breeze/inject/õ
      // 721: lload 29
      // 723: bipush 2
      // 724: anewarray 60
      // 727: dup_x2
      // 728: dup_x2
      // 729: pop
      // 72a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72d: bipush 1
      // 72e: swap
      // 72f: aastore
      // 730: dup_x1
      // 731: swap
      // 732: bipush 0
      // 733: swap
      // 734: aastore
      // 735: invokevirtual rip/breeze/inject/Util140.processAll_3 ([Ljava/lang/Object;)V
      // 738: iinc 44 1
      // 73b: iload 43
      // 73d: lload 2
      // 73e: lconst_0
      // 73f: lcmp
      // 740: iflt 748
      // 743: ifne 9fb
      // 746: iload 43
      // 748: ifeq 70a
      // 74b: lload 2
      // 74c: lconst_0
      // 74d: lcmp
      // 74e: iflt 73b
      // 751: goto 758
      // 754: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 757: athrow
      // 758: aload 0
      // 759: iload 43
      // 75b: ifne 9e9
      // 75e: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 761: bipush 0
      // 762: anewarray 60
      // 765: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 768: ifle 9e7
      // 76b: goto 772
      // 76e: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 771: athrow
      // 772: aload 4
      // 774: lload 31
      // 776: bipush 1
      // 777: anewarray 60
      // 77a: dup_x2
      // 77b: dup_x2
      // 77c: pop
      // 77d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 780: bipush 0
      // 781: swap
      // 782: aastore
      // 783: invokevirtual rip/breeze/inject/Util140.processAll_4 ([Ljava/lang/Object;)V
      // 786: aload 0
      // 787: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 78a: iload 43
      // 78c: lload 2
      // 78d: lconst_0
      // 78e: lcmp
      // 78f: iflt 84f
      // 792: ifne 84d
      // 795: goto 79c
      // 798: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 79b: athrow
      // 79c: ifnull 82c
      // 79f: goto 7a6
      // 7a2: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7a5: athrow
      // 7a6: bipush 0
      // 7a7: istore 44
      // 7a9: aload 0
      // 7aa: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 7ad: invokeinterface java/util/List.size ()I 1
      // 7b2: istore 45
      // 7b4: iload 44
      // 7b6: iload 45
      // 7b8: if_icmpge 82c
      // 7bb: aload 0
      // 7bc: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 7bf: iload 44
      // 7c1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7c6: checkcast rip/breeze/inject/ա
      // 7c9: iload 44
      // 7cb: lload 39
      // 7cd: bipush 2
      // 7ce: anewarray 60
      // 7d1: dup_x2
      // 7d2: dup_x2
      // 7d3: pop
      // 7d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7d7: bipush 1
      // 7d8: swap
      // 7d9: aastore
      // 7da: dup_x1
      // 7db: swap
      // 7dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7df: bipush 0
      // 7e0: swap
      // 7e1: aastore
      // 7e2: invokevirtual rip/breeze/inject/ա.method_001 ([Ljava/lang/Object;)V
      // 7e5: aload 0
      // 7e6: lload 2
      // 7e7: lconst_0
      // 7e8: lcmp
      // 7e9: iflt 84a
      // 7ec: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 7ef: iload 44
      // 7f1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7f6: checkcast rip/breeze/inject/ա
      // 7f9: aload 4
      // 7fb: lload 25
      // 7fd: bipush 2
      // 7fe: anewarray 60
      // 801: dup_x2
      // 802: dup_x2
      // 803: pop
      // 804: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 807: bipush 1
      // 808: swap
      // 809: aastore
      // 80a: dup_x1
      // 80b: swap
      // 80c: bipush 0
      // 80d: swap
      // 80e: aastore
      // 80f: invokevirtual rip/breeze/inject/ա.method_002 ([Ljava/lang/Object;)V
      // 812: iinc 44 1
      // 815: iload 43
      // 817: ifne 849
      // 81a: iload 43
      // 81c: ifeq 7b4
      // 81f: lload 2
      // 820: lconst_0
      // 821: lcmp
      // 822: ifle 815
      // 825: goto 82c
      // 828: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 82b: athrow
      // 82c: aload 0
      // 82d: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 830: aload 4
      // 832: lload 5
      // 834: bipush 2
      // 835: anewarray 60
      // 838: dup_x2
      // 839: dup_x2
      // 83a: pop
      // 83b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83e: bipush 1
      // 83f: swap
      // 840: aastore
      // 841: dup_x1
      // 842: swap
      // 843: bipush 0
      // 844: swap
      // 845: aastore
      // 846: invokevirtual rip/breeze/inject/թ.method_007 ([Ljava/lang/Object;)V
      // 849: aload 0
      // 84a: getfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 84d: iload 43
      // 84f: lload 2
      // 850: lconst_0
      // 851: lcmp
      // 852: ifle 8c4
      // 855: ifne 8c2
      // 858: ifnull 8be
      // 85b: goto 862
      // 85e: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 861: athrow
      // 862: bipush 0
      // 863: istore 44
      // 865: aload 0
      // 866: getfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 869: invokeinterface java/util/List.size ()I 1
      // 86e: istore 45
      // 870: iload 44
      // 872: iload 45
      // 874: if_icmpge 8be
      // 877: aload 0
      // 878: getfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 87b: iload 44
      // 87d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 882: checkcast rip/breeze/inject/է
      // 885: aload 4
      // 887: lload 19
      // 889: bipush 2
      // 88a: anewarray 60
      // 88d: dup_x2
      // 88e: dup_x2
      // 88f: pop
      // 890: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 893: bipush 1
      // 894: swap
      // 895: aastore
      // 896: dup_x1
      // 897: swap
      // 898: bipush 0
      // 899: swap
      // 89a: aastore
      // 89b: invokevirtual rip/breeze/inject/է.method_001 ([Ljava/lang/Object;)V
      // 89e: iinc 44 1
      // 8a1: lload 2
      // 8a2: lconst_0
      // 8a3: lcmp
      // 8a4: iflt 936
      // 8a7: iload 43
      // 8a9: ifne 936
      // 8ac: iload 43
      // 8ae: ifeq 870
      // 8b1: lload 2
      // 8b2: lconst_0
      // 8b3: lcmp
      // 8b4: ifle 8a1
      // 8b7: goto 8be
      // 8ba: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8bd: athrow
      // 8be: aload 0
      // 8bf: getfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 8c2: iload 43
      // 8c4: ifne 94c
      // 8c7: ifnull 936
      // 8ca: goto 8d1
      // 8cd: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8d0: athrow
      // 8d1: bipush 0
      // 8d2: istore 44
      // 8d4: aload 0
      // 8d5: getfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 8d8: invokeinterface java/util/List.size ()I 1
      // 8dd: istore 45
      // 8df: iload 44
      // 8e1: iload 45
      // 8e3: if_icmpge 936
      // 8e6: aload 0
      // 8e7: getfield rip/breeze/inject/BreezeClass12.list_å Ljava/util/List;
      // 8ea: iload 44
      // 8ec: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 8f1: checkcast rip/breeze/inject/ö
      // 8f4: lload 9
      // 8f6: aload 4
      // 8f8: bipush 1
      // 8f9: bipush 3
      // 8fa: anewarray 60
      // 8fd: dup_x1
      // 8fe: swap
      // 8ff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 902: bipush 2
      // 903: swap
      // 904: aastore
      // 905: dup_x1
      // 906: swap
      // 907: bipush 1
      // 908: swap
      // 909: aastore
      // 90a: dup_x2
      // 90b: dup_x2
      // 90c: pop
      // 90d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 910: bipush 0
      // 911: swap
      // 912: aastore
      // 913: invokevirtual rip/breeze/inject/ö.method_001 ([Ljava/lang/Object;)V
      // 916: iinc 44 1
      // 919: iload 43
      // 91b: lload 2
      // 91c: lconst_0
      // 91d: lcmp
      // 91e: iflt 926
      // 921: ifne 9e2
      // 924: iload 43
      // 926: ifeq 8df
      // 929: lload 2
      // 92a: lconst_0
      // 92b: lcmp
      // 92c: iflt 919
      // 92f: goto 936
      // 932: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 935: athrow
      // 936: aload 0
      // 937: iload 43
      // 939: lload 2
      // 93a: lconst_0
      // 93b: lcmp
      // 93c: ifle 9e4
      // 93f: ifne 9e3
      // 942: getfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 945: goto 94c
      // 948: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 94b: athrow
      // 94c: ifnull 9b4
      // 94f: bipush 0
      // 950: istore 44
      // 952: aload 0
      // 953: getfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 956: invokeinterface java/util/List.size ()I 1
      // 95b: istore 45
      // 95d: iload 44
      // 95f: iload 45
      // 961: if_icmpge 9b4
      // 964: aload 0
      // 965: getfield rip/breeze/inject/BreezeClass12.list_ä Ljava/util/List;
      // 968: iload 44
      // 96a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 96f: checkcast rip/breeze/inject/ö
      // 972: lload 9
      // 974: aload 4
      // 976: bipush 0
      // 977: bipush 3
      // 978: anewarray 60
      // 97b: dup_x1
      // 97c: swap
      // 97d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 980: bipush 2
      // 981: swap
      // 982: aastore
      // 983: dup_x1
      // 984: swap
      // 985: bipush 1
      // 986: swap
      // 987: aastore
      // 988: dup_x2
      // 989: dup_x2
      // 98a: pop
      // 98b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98e: bipush 0
      // 98f: swap
      // 990: aastore
      // 991: invokevirtual rip/breeze/inject/ö.method_001 ([Ljava/lang/Object;)V
      // 994: iinc 44 1
      // 997: iload 43
      // 999: lload 2
      // 99a: lconst_0
      // 99b: lcmp
      // 99c: iflt 9a4
      // 99f: ifne 9e2
      // 9a2: iload 43
      // 9a4: ifeq 95d
      // 9a7: lload 2
      // 9a8: lconst_0
      // 9a9: lcmp
      // 9aa: iflt 997
      // 9ad: goto 9b4
      // 9b0: invokestatic rip/breeze/inject/BreezeClass12.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 9b3: athrow
      // 9b4: aload 4
      // 9b6: aload 0
      // 9b7: getfield rip/breeze/inject/BreezeClass12.int_è I
      // 9ba: lload 17
      // 9bc: dup2_x1
      // 9bd: pop2
      // 9be: aload 0
      // 9bf: getfield rip/breeze/inject/BreezeClass12.int_ç I
      // 9c2: bipush 3
      // 9c3: anewarray 60
      // 9c6: dup_x1
      // 9c7: swap
      // 9c8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9cb: bipush 2
      // 9cc: swap
      // 9cd: aastore
      // 9ce: dup_x1
      // 9cf: swap
      // 9d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9d3: bipush 1
      // 9d4: swap
      // 9d5: aastore
      // 9d6: dup_x2
      // 9d7: dup_x2
      // 9d8: pop
      // 9d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9dc: bipush 0
      // 9dd: swap
      // 9de: aastore
      // 9df: invokevirtual rip/breeze/inject/Util140.processAll_24 ([Ljava/lang/Object;)V
      // 9e2: aload 0
      // 9e3: bipush 1
      // 9e4: putfield rip/breeze/inject/BreezeClass12.bool_ã Z
      // 9e7: aload 4
      // 9e9: lload 41
      // 9eb: bipush 1
      // 9ec: anewarray 60
      // 9ef: dup_x2
      // 9f0: dup_x2
      // 9f1: pop
      // 9f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9f5: bipush 0
      // 9f6: swap
      // 9f7: aastore
      // 9f8: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 9fb: return
      // try (97 -> 102): 103 java/lang/IllegalStateException
      // try (114 -> 145): 150 java/lang/IllegalStateException
      // try (152 -> 160): 161 java/lang/IllegalStateException
      // try (177 -> 217): 218 java/lang/IllegalStateException
      // try (233 -> 241): 242 java/lang/IllegalStateException
      // try (263 -> 313): 318 java/lang/IllegalStateException
      // try (322 -> 329): 330 java/lang/IllegalStateException
      // try (347 -> 401): 406 java/lang/IllegalStateException
      // try (410 -> 413): 414 java/lang/IllegalStateException
      // try (431 -> 500): 505 java/lang/IllegalStateException
      // try (507 -> 515): 516 java/lang/IllegalStateException
      // try (534 -> 603): 608 java/lang/IllegalStateException
      // try (611 -> 619): 620 java/lang/IllegalStateException
      // try (617 -> 651): 652 java/lang/IllegalStateException
      // try (655 -> 663): 664 java/lang/IllegalStateException
      // try (680 -> 684): 685 java/lang/IllegalStateException
      // try (683 -> 689): 690 java/lang/IllegalStateException
      // try (705 -> 766): 771 java/lang/IllegalStateException
      // try (781 -> 789): 790 java/lang/IllegalStateException
      // try (787 -> 821): 822 java/lang/IllegalStateException
      // try (825 -> 833): 834 java/lang/IllegalStateException
      // try (850 -> 854): 855 java/lang/IllegalStateException
      // try (853 -> 859): 860 java/lang/IllegalStateException
      // try (875 -> 936): 941 java/lang/IllegalStateException
      // try (951 -> 959): 960 java/lang/IllegalStateException
      // try (957 -> 975): 976 java/lang/IllegalStateException
      // try (979 -> 986): 987 java/lang/IllegalStateException
      // try (999 -> 1030): 1035 java/lang/IllegalStateException
      // try (1038 -> 1045): 1046 java/lang/IllegalStateException
      // try (1040 -> 1068): 1069 java/lang/IllegalStateException
      // try (1048 -> 1072): 1073 java/lang/IllegalStateException
      // try (1084 -> 1138): 1143 java/lang/IllegalStateException
      // try (1166 -> 1173): 1174 java/lang/IllegalStateException
      // try (1185 -> 1216): 1221 java/lang/IllegalStateException
      // try (1225 -> 1228): 1229 java/lang/IllegalStateException
      // try (1240 -> 1278): 1283 java/lang/IllegalStateException
      // try (1285 -> 1293): 1294 java/lang/IllegalStateException
      // try (1306 -> 1344): 1349 java/lang/IllegalStateException
   }

   public static void toggle_2(boolean var0) {
      bool_â = var0;
   }

   public static boolean isValid() {
      return bool_â;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();

      try {
         return !var0;
      } catch (IllegalStateException var1) {
         throw getIllegalStateException(var1);
      }
   }

   static {
      if (!checkCondition()) {
         toggle_2(true);
      }
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
      return var0;
   }
}
